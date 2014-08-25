package com.projetoes.projetoes;

import com.projetoes.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Configuracao extends Activity{
	
	private static boolean somAtivo = true;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.configuracao);
	}

	public void voltar(View v){
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
		finish();
	}

	public void sound(View v){
	     CheckBox checkBox = (CheckBox) findViewById(R.id.som);
	     setSomAtivo(checkBox.isChecked());
	}

	public static boolean isSomAtivo() {
		return somAtivo;
	}

	public static void setSomAtivo(boolean somAtivo) {
		Configuracao.somAtivo = somAtivo;
	}
	
	
}
