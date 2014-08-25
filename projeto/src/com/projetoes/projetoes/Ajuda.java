package com.projetoes.projetoes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.projetoes.R;

public class Ajuda extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajuda);
    }
	
	 public void voltar(View v){
		 Intent intent = new Intent(this, MainActivity.class);
	    startActivity(intent);
	    finish();
	    }
	
}
