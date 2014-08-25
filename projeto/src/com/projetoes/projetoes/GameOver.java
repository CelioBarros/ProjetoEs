package com.projetoes.projetoes;

import com.projetoes.R;
import com.projetoes.banco.DataBase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameOver extends Activity{
	
	@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.gameover);
	        gameOver();
	    }
	
    public void voltar(View v){
    	Intent intent = new Intent(this, MainActivity.class);
    	startActivity(intent);
    	finish();
    }
    

    public void gameOver(){
    	DataBase db = DataBase.getInstance(this);
    	TextView textView = (TextView) findViewById(R.id.gameOver);
    	textView.setText("Melhor Ranking: "+db.findRanking());
    }
}
