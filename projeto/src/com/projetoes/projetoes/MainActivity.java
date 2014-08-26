package com.projetoes.projetoes;

import com.projetoes.R;
import com.projetoes.jogo.Jogo;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends ActionBarActivity {
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    public void iniciarJogo(View v){
    	
    	Intent intent = new Intent(this, Jogo.class);
    	startActivity(intent);
    	finish();
    }
    
    public void sairJogo(View v){
    	finish();
    }
    
    
    public void ajuda(View v){
    	Intent intent = new Intent(this, Ajuda.class);
    	startActivity(intent);
    	finish();
    }
    
    public void recordeTela(View v){
    	Intent intent = new Intent(this, Recorde.class);
    	startActivity(intent);
    	finish();
    }
    
    public void configuracao(View v){
    	Intent intent = new Intent(this, Configuracao.class);
    	startActivity(intent);
    	finish();
    }
   
}
