package com.es.projetoes;

import com.es.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Configuracao extends Activity{

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuracao);
    }
	
	 public void voltar(View v){
		Intent intent = new Intent(this, MainActivity.class);
	    startActivity(intent);
	    finish();
	    }
}
