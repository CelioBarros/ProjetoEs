package com.es.banco;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

	private static final int DATABASE_VERSION = 2;
	private static final String DATABASE_NAME = "ProjetoES";
	public static final String TABLE_NAME = "Ranking";
    public static final String RANKING = "Ranking";
	private static final String DATABASE_CREATE = "CREATE TABLE "
			+ TABLE_NAME + " ( " + RANKING +" integer);";
	
	DatabaseHelper (Context context) {
	    super(context, Environment.getExternalStorageDirectory().getAbsolutePath()
	    	    + "/nome-da-aplicacao/database/" + DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DATABASE_CREATE);
	}
    
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(DatabaseHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                + newVersion + ", which will destroy all old data");
               db.execSQL("DROP TABLE IF EXISTS " + RANKING);
               onCreate(db);Log.w(DatabaseHelper.class.getName(),
                       "Upgrading database from version " + oldVersion + " to "
                               + newVersion + ", which will destroy all old data");
                              db.execSQL("DROP TABLE IF EXISTS " + "Ranking");
                              onCreate(db);
	}

}
