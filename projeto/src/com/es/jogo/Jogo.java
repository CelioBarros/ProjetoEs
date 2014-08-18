package com.es.jogo;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;

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
import org.andengine.entity.text.Text;
import org.andengine.entity.text.TextOptions;
import org.andengine.entity.util.FPSLogger;
import org.andengine.input.sensor.acceleration.AccelerationData;
import org.andengine.input.sensor.acceleration.IAccelerationListener;
import org.andengine.opengl.font.BitmapFont;
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
import org.andengine.util.HorizontalAlign;
import org.andengine.util.adt.io.in.IInputStreamOpener;

import com.es.banco.DataBase;
import com.es.projetoes.GameOver;
import com.es.projetoes.MainActivity;

import android.content.Context;
import android.content.Intent;
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

	//BackGround Paralelo
	private BitmapTextureAtlas mAutoParallaxBackgroundTexture;
	private ITextureRegion mParallaxLayerBack;

	//Ball
	Sprite ballSprite;
	Context ctx;
	private ITextureRegion ball;

	//Obstaculo
	private BitmapTextureAtlas mBitmapObstaculoTextureAtlas;
	private TextureRegion mObstaculoTextureRegion;
	Sprite obstaculoSprite;
	float teste = 900; 

	//Buraco
	private BitmapTextureAtlas mBitmapBuracoTextureAtlas;
	private TextureRegion mBuracoTextureRegion;
	Sprite buracoSprite;

	//Score	
	private int score = 0;
	int countScore = 0;
	private BitmapFont mBitmapFont;
	boolean isAlive = true;
	private Text bitmapText;

	//Listas
	private ArrayList<Sprite> listaBlocos = new ArrayList<Sprite>();
	private ArrayList<Sprite> listaBlocosRemove = new ArrayList<Sprite>();
	private ArrayList<Sprite> listaBuraco = new ArrayList<Sprite>();
	private ArrayList<Sprite> listaBuracoRemove = new ArrayList<Sprite>();

	DataBase db = new DataBase(this);


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

		this.mBitmapFont = new BitmapFont(this.getTextureManager(), this.getAssets(), "font/BitmapFont.fnt");
		this.mBitmapFont.load();

		this.mBitmapBuracoTextureAtlas = new BitmapTextureAtlas(this.getTextureManager(), 70, 69);
		this.mBuracoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(this.mBitmapBuracoTextureAtlas, this, "buraco.png",0,0);
		mBitmapBuracoTextureAtlas.load();
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


		//while (true) {
		//		listaBlocos.add(new Sprite(900,100, mObstaculoTextureRegion,getVertexBufferObjectManager()));

		//	}

		scene.attachChild(ballSprite);   
		bitmapText = new Text(0, 0, this.mBitmapFont, "Score:                  ", new TextOptions(HorizontalAlign.CENTER), this.getVertexBufferObjectManager());
		scene.attachChild(bitmapText);
		/* Create two sprits and add it to the scene. */

		scene.registerUpdateHandler(new IUpdateHandler() {
			//float testeAux = teste;

			@Override
			public void reset() {  
			}

			@Override
			public void onUpdate(float pSecondsElapsed) {
				int numero = (int) (Math.random()*448);
				if(countScore%101 == 0){
					listaBlocos.add(new Sprite(900,numero, mObstaculoTextureRegion,getVertexBufferObjectManager()));

				}
				if(countScore%121 == 0 && countScore != 0){
					listaBuraco.add(new Sprite(900,numero, mBuracoTextureRegion,getVertexBufferObjectManager()));

				}

				for (Sprite bloco : listaBlocos) {
					//Log.d("teste", bloco.toString());
					scene.detachChild(bloco);
					scene.attachChild(bloco);
				}

				for (Sprite buraco : listaBuraco) {
					//Log.d("teste", bloco.toString());
					scene.detachChild(buraco);
					scene.attachChild(buraco);
				}

				//Log.d("teste", listaBlocos.size() + "" );
				Score();
				for (Sprite bloco : listaBlocos) {

					float testeAux = bloco.getX()- 2f;
					bloco.setPosition(testeAux, bloco.getY());

					if(ballSprite.collidesWith(bloco)){
						ballSprite.setPosition(bloco.getX()-94, ballSprite.getY());
						//isAlive= false;
					}  
					if(bloco.getX()<0){
						scene.detachChild(bloco);
						listaBlocosRemove.add(bloco);

					}
				}
				for (Sprite bloco : listaBlocosRemove) {
					listaBlocos.remove(bloco);
				}
				listaBlocosRemove = new ArrayList<Sprite>();
				//Log.d("Teste", score + ""  );

				for (Sprite buraco : listaBuraco) {

					float testeAux = buraco.getX()- 2f;
					buraco.setPosition(testeAux, buraco.getY());

					if(ballSprite.collidesWith(buraco) && isAlive){
						db.addRanking(score);
						Intent telaInicial = new Intent(Jogo.this, GameOver.class);
						startActivity(telaInicial);
						finish();
						isAlive= false;

						//scene.unregisterUpdateHandler(this);
						break;
					}  
					if(buraco.getX()<0){
						scene.detachChild(buraco);
						listaBlocosRemove.add(buraco);

					}
				}
				
				for (Sprite buraco : listaBuracoRemove) {
					listaBuraco.remove(buraco);
				}
				listaBuracoRemove = new ArrayList<Sprite>();
				
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

	public void Score(){
		if(isAlive){
			this.countScore = countScore + 1;
			this.score = countScore/100;	
			bitmapText.setText("Score: " +(int) score);
		}
	}

	public void SpawnBlocos(){

	}



	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}