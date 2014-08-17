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

    public void onClick(View v) {
        
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
    
    public void sairJogo(View v){
    	finish();
    	System.exit(0);
    }
    
    public void voltar(View v){
    	setContentView(R.layout.activity_main);
    }
    
    public void ajuda(View v){
    	setContentView(R.layout.ajuda);
    }
    
    public void recordeTela(View v){
    	setContentView(R.layout.recorde);
    	recorde(v);
    }
    
    public void recorde(View v){
    	DataBase db = DataBase.getInstance(this);
    	TextView textView = (TextView) findViewById(R.id.recorde);
    	textView.setText("Melhor Ranking: "+db.findRanking());
    }
}
