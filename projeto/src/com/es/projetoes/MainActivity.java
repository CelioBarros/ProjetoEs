package com.es.projetoes;

import java.util.List;



import com.es.R;
import com.es.banco.DataBase;
import com.es.jogo.Jogo;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


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
    	System.exit(0);
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
