package com.example.testeandengine;

import java.io.IOException;
import java.io.InputStream;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.handler.physics.PhysicsHandler;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.entity.util.FPSLogger;
import org.andengine.input.sensor.acceleration.AccelerationData;
import org.andengine.input.sensor.acceleration.IAccelerationListener;
import org.andengine.opengl.texture.ITexture;
import org.andengine.opengl.texture.bitmap.BitmapTexture;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TextureRegionFactory;
import org.andengine.ui.activity.SimpleBaseGameActivity;
import org.andengine.util.adt.io.in.IInputStreamOpener;

import android.content.Context;
import android.util.Log;

public class MainActivity extends SimpleBaseGameActivity implements IAccelerationListener  {
	private static int CAMERA_WIDTH = 800;
	private static int CAMERA_HEIGHT = 480;
	Context ctx;
	Sprite ballSprite;

	private ITextureRegion mBackgroundTextureRegion,ball, mTowerTextureRegion, mRing1, mRing2, mRing3;


	@Override
	public EngineOptions onCreateEngineOptions() 
	{
		// TODO Auto-generated method stub
		final Camera camera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_FIXED, new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), camera);

	}

	@Override
	protected void onCreateResources() 
	{

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
	protected Scene onCreateScene() {
		// TODO Auto-generated method stub
		this.mEngine.registerUpdateHandler(new FPSLogger());      
		final Scene scene = new Scene();    
		ballSprite = new Sprite(0, 0, this.ball, getVertexBufferObjectManager());
		final PhysicsHandler physicsHandler = new PhysicsHandler(ballSprite);
		ballSprite.registerUpdateHandler(physicsHandler);
		scene.attachChild(ballSprite);      
		return scene;
	}

	@Override
	public void onAccelerationAccuracyChanged(AccelerationData pAccelerationData) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAccelerationChanged(AccelerationData pAccelerationData) {
		// TODO Auto-generated method stub
		Log.d("x=","x="+pAccelerationData.getX());
		ballSprite.setPosition(
				ballSprite.getX() + pAccelerationData.getX(),
				ballSprite.getY() + pAccelerationData.getY()
				);
		//body.setLinearDamping(1.5f);

	}
}