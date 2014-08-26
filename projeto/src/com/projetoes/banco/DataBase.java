package com.projetoes.banco;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DataBase extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "equiliball.db";
	public static final String TABLE_RANKING = "ranking";
	public static final String COLUMN_RANKING = "ranking";
	private final String CREATE_RANKING_TABLE = "CREATE TABLE "
			+ TABLE_RANKING + "(" + COLUMN_RANKING
			+ " INTEGER NOT NULL )";

	/** * Constructor. * * @param context - */
	public DataBase(final Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public final void onCreate(final SQLiteDatabase db) {
		db.execSQL(CREATE_RANKING_TABLE);
	}

	@Override
	public final void onUpgrade(final SQLiteDatabase db, final int oldVersion,
			final int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_RANKING);
		onCreate(db);
	}

	/**
	 * * Add Ranking in database. * * @param ranking Ranking that will be
	 * registered in database
	 * 
	 */
	public final void addRanking(int ranking) {
		final ContentValues values = new ContentValues();

		values.put(COLUMN_RANKING, ranking);
		SQLiteDatabase db = this.getWritableDatabase();
		db.insert(TABLE_RANKING, null, values);
		db.close();
	}


	/**
	 * * Search all ranking in the database. * * @return List - list that
	 * contains all ranking.
	 */
	public final String findRanking() {
		final String query = "Select "+COLUMN_RANKING+" FROM " + TABLE_RANKING;
		final SQLiteDatabase db = this.getWritableDatabase();
		final Cursor cursor = db.rawQuery(query, null);
		List<Integer> list = new ArrayList<Integer>();
		while (cursor.moveToNext()) {
			list.add(Integer.parseInt(cursor.getString(0)));
		}
		if (list.isEmpty()){
			return " Não existe Ranking";
		}
		int melhor=0;
		for (Integer i : list) {
			if(i>melhor)melhor = i;
		}
		cursor.close();
		db.close();
		return String.valueOf(melhor);
	}


	private static DataBase instance = null;

	public static DataBase getInstance(Context context) {
		if(instance == null) {
			instance = new DataBase(context);
		}
		return instance;
	}
}