package com.es.jogo;

import java.io.IOException;
import java.io.InputStream;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.handler.IUpdateHandler;
import org.andengine.engine.handler.physics.PhysicsHandler;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.AutoParallaxBackground;
import org.andengine.entity.scene.background.ParallaxBackground.ParallaxEntity;
import org.andengine.entity.sprite.Sprite;
import org.andengine.entity.util.FPSLogger;
import org.andengine.input.sensor.acceleration.AccelerationData;
import org.andengine.input.sensor.acceleration.IAccelerationListener;
import org.andengine.opengl.texture.ITexture;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.bitmap.BitmapTexture;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.opengl.texture.region.TextureRegionFactory;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.ui.activity.SimpleBaseGameActivity;
import org.andengine.util.adt.io.in.IInputStreamOpener;

import android.content.Context;
import android.util.Log;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga
 *
 * @author Nicolas Gramlich
 * @since 19:58:39 - 19.07.2010
 */
public class Jogo extends SimpleBaseGameActivity implements IAccelerationListener{
	// ===========================================================
	// Constants
	// ===========================================================

	private static final int CAMERA_WIDTH = 850;
	private static final int CAMERA_HEIGHT = 480;
	// ===========================================================
	// Fields
	// ===========================================================


	private BitmapTextureAtlas mAutoParallaxBackgroundTexture;

	private ITextureRegion mParallaxLayerBack;

	Sprite ballSprite;
	Context ctx;
	private ITextureRegion ball;
	Sprite obstaculoSprite;
	float teste = 900; 

	private BitmapTextureAtlas mBitmapObstaculoTextureAtlas;
	private TextureRegion mObstaculoTextureRegion;

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public EngineOptions onCreateEngineOptions() {
		final Camera camera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_FIXED, new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), camera);
	}

	@Override
	public void onCreateResources() {
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/");

		this.mBitmapObstaculoTextureAtlas = new BitmapTextureAtlas(this.getTextureManager(), 32, 32);
		this.mObstaculoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(this.mBitmapObstaculoTextureAtlas, this, "bloco.png",0,0);

		mBitmapObstaculoTextureAtlas.load();

		this.mAutoParallaxBackgroundTexture = new BitmapTextureAtlas(this.getTextureManager(), 1024, 1024);

		this.mParallaxLayerBack = BitmapTextureAtlasTextureRegionFactory.createFromAsset(this.mAutoParallaxBackgroundTexture, this, "background_jogo.png", 0, 188);

		this.mAutoParallaxBackgroundTexture.load();

		try {

			ITexture ballTexture = new BitmapTexture(this.getTextureManager(), new IInputStreamOpener() {
				@Override
				public InputStream open() throws IOException {
					return getAssets().open("ball.png");
				}
			});

			ballTexture.load();

			this.ball = TextureRegionFactory.extractFromTexture(ballTexture);

			this.enableAccelerationSensor(this); //Enable Sensor here

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       

	}

	@Override
	public Scene onCreateScene() {
		this.mEngine.registerUpdateHandler(new FPSLogger());

		final Scene scene = new Scene();
		final AutoParallaxBackground autoParallaxBackground = new AutoParallaxBackground(0, 0, 0, 5);
		final VertexBufferObjectManager vertexBufferObjectManager = this.getVertexBufferObjectManager();
		autoParallaxBackground.attachParallaxEntity(new ParallaxEntity(-20f, new Sprite(0, CAMERA_HEIGHT - this.mParallaxLayerBack.getHeight(), this.mParallaxLayerBack, vertexBufferObjectManager)));
		scene.setBackground(autoParallaxBackground);

		ballSprite = new Sprite(0, 0, this.ball, getVertexBufferObjectManager());
		final PhysicsHandler physicsHandler = new PhysicsHandler(ballSprite);
		ballSprite.registerUpdateHandler(physicsHandler);
		final Sprite bloco = new Sprite(750,100, mObstaculoTextureRegion,getVertexBufferObjectManager());
		scene.attachChild(bloco);
		scene.attachChild(ballSprite);   


		/* Create two sprits and add it to the scene. */

		scene.registerUpdateHandler(new IUpdateHandler() {

			@Override
			public void reset() {  
			}

			@Override
			public void onUpdate(float pSecondsElapsed) {
				teste = teste- 2f;
				bloco.setPosition(teste, 100);
				
				if(ballSprite.collidesWith(bloco)){
					ballSprite.setPosition(bloco.getX()-94, ballSprite.getY());
				}

			}
		});
		return scene;
	}
	@Override
	public void onAccelerationAccuracyChanged(AccelerationData pAccelerationData) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAccelerationChanged(AccelerationData pAccelerationData) {


		float positionX = ballSprite.getX() + pAccelerationData.getX();
		float positionY = ballSprite.getY() + pAccelerationData.getY();


		if(positionY > 390) {
			positionY = 390;
		}
		if(positionY < 0) {
			positionY = 0;
		}
		if(positionX < 0) {
			positionX = 0;
		}
		if(positionX > 760) {
			positionX = 760;
		}
		ballSprite.setPosition(
				positionX,
				positionY
				);

	}

	// ===========================================================
	// Methods
	// ===========================================================


	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}