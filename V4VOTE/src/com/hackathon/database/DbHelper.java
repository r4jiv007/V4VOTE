package com.hackathon.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "hackathon.db";

	private static final int DATABASE_VERSION = 1;

	public DbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		LocalCandidate.createTable(database);
		PMCandidate.createTable(database);
	}

	@Override
	public void onUpgrade(SQLiteDatabase database, int oldver, int newver) {
		LocalCandidate.upgradeTable(database, oldver, newver);
		PMCandidate.upgradeTable(database, oldver, newver);
	}

}
