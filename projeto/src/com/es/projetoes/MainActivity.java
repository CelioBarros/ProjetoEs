package com.es.projetoes;

import com.es.R;
import com.es.jogo.Jogo;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button bIniciar = (Button) findViewById(R.id.iniciar);
        Button bAjuda = (Button) findViewById(R.id.ajuda);
        Button bOpcoes   = (Button) findViewById(R.id.opcoes);
        Button bRecorde   = (Button) findViewById(R.id.recorde);
/*        bIniciar.setOnClickListener((OnClickListener) this);*/
        bAjuda.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		switch (v.getId()) {
                case R.id.ajuda:
                	setContentView(R.layout.ajuda);
        		}
        	}
        });
        /*bOpcoes.setOnClickListener((OnClickListener) this);
        bRecorde.setOnClickListener((OnClickListener) this);*/
    }

    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.ajuda:
        	setContentView(R.layout.ajuda);
        case R.id.recorde:
            finish();
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void iniciarJogo(View v){
    	Intent intent = new Intent(this, Jogo.class);
    	startActivity(intent);
    }
}
