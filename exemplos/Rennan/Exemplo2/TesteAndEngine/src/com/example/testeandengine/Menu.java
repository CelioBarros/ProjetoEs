package com.example.testeandengine;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity{
	Button button;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
	}
	public void metodo(View view){
		 Intent intent = new Intent(this, MainActivity.class);  
         startActivity(intent);
	}
}
