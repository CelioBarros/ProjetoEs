package com.projetoes.projetoes;

import com.projetoes.R;
import com.projetoes.banco.DataBase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Recorde extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recorde);
		recorde();
	}
	public void recorde(){
		DataBase db = DataBase.getInstance(this);
		TextView textView = (TextView) findViewById(R.id.recorde);
		textView.setText("Melhor Ranking: "+db.findRanking());
	}
	public void voltar(View v){
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
		finish();
	}
}
