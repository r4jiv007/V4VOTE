package com.hackathon.database;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class LocalCandidate {

	public static String TABLE_NAME = "localcandidate";
	public static String COLUMN__ID = "_id";
	public static String COLUMN_NAME = "name";
	public static String COLUMN_IMAGE = "image";
	public static String COLUMN_PARTY = "party";
	public static String COLUMN_RATING = "rating";
	public static String COLUMN_NUMBER = "number";
	public static String COLUMN_MANIFESTO = "manifesto";

	private static final String CREATE_TABLE = "create table IF NOT EXISTS "
			+ TABLE_NAME + "(" + COLUMN__ID
			+ " integer primary key autoincrement," + COLUMN_NAME
			+ " unique not null," + COLUMN_PARTY + " text not null, "
			+ COLUMN_IMAGE + " text," + COLUMN_MANIFESTO + " text,"
			+ COLUMN_RATING + " integer , " + COLUMN_NUMBER + " integer  );";

	public static void createTable(SQLiteDatabase database) {
		Log.i("TVB", "creating table");
		database.execSQL(CREATE_TABLE);
	}

	public static void upgradeTable(SQLiteDatabase database, int oldver,
			int newver) {
		Log.w("TVB", "upgrading  table from " + oldver + " to " + newver);
		createTable(database);
	}

}
