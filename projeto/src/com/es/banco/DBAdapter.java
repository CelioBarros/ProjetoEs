package com.es.banco;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class DBAdapter {

	private SQLiteDatabase database;
	private DatabaseHelper dbHelper;
	private String[] allColumns = { DatabaseHelper.RANKING};
	
	public DBAdapter(Context context) {          
		dbHelper = new DatabaseHelper(context);
	}
	
	public void insertRecord(int ranking) { 
       ContentValues values = new ContentValues(); 
       values.put(dbHelper.RANKING, ranking); 
       database.insert(dbHelper.TABLE_NAME, null, values); 
    }

}
