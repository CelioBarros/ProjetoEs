package com.es.jogo;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.andengine.audio.music.Music;
import org.andengine.audio.music.MusicFactory;
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
import org.andengine.ui.activity.SimpleBaseGameActivity;
import org.andengine.util.HorizontalAlign;
import org.andengine.util.adt.io.in.IInputStreamOpener;

import com.es.banco.DataBase;
import com.es.projetoes.GameOver;

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
	private float xAntigoBola = 0;
	private float yAntigoBola = 0;
	//Obstaculo
	private BitmapTextureAtlas mBitmapObstaculoTextureAtlas;
	private TextureRegion mObstaculoTextureRegion;
	Sprite obstaculoSprite;
	float teste = 900; 

	//Buraco
	private BitmapTextureAtlas mBitmapBuracoTextureAtlas;
	private TextureRegion mBuracoTextureRegion;
	Sprite buracoSprite;
	
	//Bomba
	private BitmapTextureAtlas mBitmapBombaTextureAtlas;
	private TextureRegion mBombaTextureRegion;
	Sprite bombaSprite;
	
	//Moeda
	private BitmapTextureAtlas mBitmapMoedaTextureAtlas;
	private TextureRegion mMoedaTextureRegion;
	Sprite moedaSprite;
	Sprite moeda;


	//Score	
	private int score = 0;
	int countScore = 0;
	private BitmapFont mBitmapFont;
	boolean isAlive = true;
	private Text bitmapText;

	//Listas
	private ArrayList<Sprite> listaBlocos = new ArrayList<Sprite>();
	private ArrayList<Sprite> listaBlocosRemove = new ArrayList<Sprite>();
	private ArrayList<Sprite> listaFim = new ArrayList<Sprite>();
	private ArrayList<Sprite> listaFimRemove = new ArrayList<Sprite>();
	private Music mMusic;
	DataBase db = new DataBase(this);
	
	//private Music myMusic;

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
		EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.LANDSCAPE_FIXED, new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), camera);
		engineOptions.getAudioOptions().setNeedsMusic(true);
		return engineOptions;
	}

	@Override
	public void onCreateResources() {
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/"); 
		MusicFactory.setAssetBasePath("mfx/");
		
		try {
			mMusic = MusicFactory.createMusicFromAsset(getMusicManager(), this, "music.mp3");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
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

		//buraco
		this.mBitmapBuracoTextureAtlas = new BitmapTextureAtlas(this.getTextureManager(), 70, 69);
		this.mBuracoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(this.mBitmapBuracoTextureAtlas, this, "buraco.png",0,0);
		mBitmapBuracoTextureAtlas.load();
		
		//bomba
		this.mBitmapBombaTextureAtlas = new BitmapTextureAtlas(this.getTextureManager(), 32, 32);
		this.mBombaTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(this.mBitmapBombaTextureAtlas, this, "bomba.png",0,0);
		mBitmapBombaTextureAtlas.load();
		
		//Moeda
		this.mBitmapMoedaTextureAtlas = new BitmapTextureAtlas(this.getTextureManager(), 32, 32);
		this.mMoedaTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(this.mBitmapMoedaTextureAtlas, this, "moeda.png",0,0);
		mBitmapMoedaTextureAtlas.load();
	}

	@Override
	public Scene onCreateScene() {
		this.mEngine.registerUpdateHandler(new FPSLogger());

		final Scene scene = new Scene();
		//myMusic.play();
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
				if(countScore%121 == 0 && countScore!=0){
					if((int) (Math.random()*2)==0){
						listaFim.add(new Sprite(900,numero, mBuracoTextureRegion,getVertexBufferObjectManager()));
					} else{
						listaFim.add(new Sprite(900,numero, mBombaTextureRegion,getVertexBufferObjectManager()));
					}
				}
				
				if(countScore%1081 == 0){
					if(countScore== 0){
						moeda = new Sprite(1500,numero, mMoedaTextureRegion,getVertexBufferObjectManager());
					}else{
						moeda = new Sprite(900,numero, mMoedaTextureRegion,getVertexBufferObjectManager());
					}
					scene.attachChild(moeda);
				}

				for (Sprite bloco : listaBlocos) {
					//Log.d("teste", bloco.toString());
					scene.detachChild(bloco);
					scene.attachChild(bloco);
				}

				for (Sprite fim : listaFim) {
					//Log.d("teste", bloco.toString());
					scene.detachChild(fim);
					scene.attachChild(fim);
				}

				//Log.d("teste", listaBlocos.size() + "" );
				Score();
				for (Sprite bloco : listaBlocos) {

					float testeAux = bloco.getX()- 2f;
					bloco.setPosition(testeAux, bloco.getY());

					try {
						if(isCollides(ballSprite, bloco)){
							if(ballSprite.getX()==0){
								end();
								break;
							}
							ballSprite.setPosition(xAntigoBola, yAntigoBola);
							//isAlive= false;
						}else{
							if (yAntigoBola < ballSprite.getY()) {
								yAntigoBola = ballSprite.getY()-10;
							}
							else if(yAntigoBola > ballSprite.getY()){
								yAntigoBola = ballSprite.getY()+10;
							}else{
								yAntigoBola = ballSprite.getY();
							}
							if (xAntigoBola != ballSprite.getX()) {
								xAntigoBola = ballSprite.getX()-6;
							}
						}
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					if(bloco.getX()<0){
						scene.detachChild(bloco);
						listaBlocosRemove.add(bloco);

					}
				}
				for (Sprite bloco : listaBlocosRemove) {
					listaBlocos.remove(bloco);
				}
				listaBlocosRemove.clear();
				//Log.d("Teste", score + ""  );

				for (Sprite fim : listaFim) {

					float testeAux = fim.getX()- 2f;
					fim.setPosition(testeAux, fim.getY());

					try {
						if(isCollides(ballSprite,fim) && isAlive){
							end();

							//scene.unregisterUpdateHandler(this);
							break;
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					if(fim.getX()<0){
						scene.detachChild(fim);
						listaBlocosRemove.add(fim);

					}
				}
				
				for (Sprite buraco : listaFimRemove) {
					listaFim.remove(buraco);
				}
				listaFimRemove.clear();

				moeda.setPosition(moeda.getX()-2f, moeda.getY());
				
				if(moeda.getX()<0 ){
					scene.detachChild(moeda);
				} 
				if(ballSprite.collidesWith(moeda) && isAlive){
					countScore = countScore + 100;
					scene.detachChild(moeda);
				}
			}
		});
		return scene;
	}
	@Override
	public void onAccelerationAccuracyChanged(AccelerationData pAccelerationData) {
		// TODO Auto-generated method stub

	}
	
	public void end(){
		db.addRanking(score);
		Intent telaInicial = new Intent(Jogo.this, GameOver.class);
		startActivity(telaInicial);
		finish();
		isAlive= false;
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
	
	
	@Override
	public synchronized void onResumeGame() {
	  if(mMusic != null && !mMusic.isPlaying()){
		  
		  mMusic.play();  
	    //mMusic.play();
	  }
	  super.onResumeGame();
	}

	
	@Override
	public synchronized void onPauseGame() {
	  if(mMusic != null && mMusic.isPlaying()){
	    mMusic.pause();
	  }
	  
	  super.onPauseGame();
	}

	public boolean isCollides(Sprite animSprite1 ,Sprite animSprite2) throws Exception{


		float diffX = Math.abs( (animSprite1.getX() +  animSprite1.getWidth()/2 )- 
		             (animSprite2.getX() + animSprite2.getWidth()/2 ));
		float diffY = Math.abs( (animSprite1.getY() +  animSprite1.getHeight()/2 )- 
		             (animSprite2.getY() + animSprite2.getHeight()/2 ));

		if(diffX < (animSprite1.getWidth()/2 + animSprite2.getWidth()/3) 
		           && diffY < (animSprite1.getHeight()/2 + animSprite2.getHeight()/3)){

		   return true;
		}else
		  return false;
		}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}