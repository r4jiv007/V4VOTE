package com.hackathon.contentprovider;

import java.util.Arrays;
import java.util.HashSet;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

import com.hackathon.database.DbHelper;
import com.hackathon.database.LocalCandidate;
import com.hackathon.database.PMCandidate;

public class AppContentProvider extends ContentProvider {

	/**
	 * Created by Rajiv on 8/12/13.
	 * <p/>
	 * This class act as content provider for Channel_Table
	 */

	private DbHelper tableHelper;

	private static final int PMCANDIDATE_TABLE_ = 10;
	private static final int PMCANDIDATE_TABLE_ROW = 20;

	private static final int LOCALCANDIDATE_TABLE_ = 30;
	private static final int LOCALCANDIDATE_TABLE_ROW = 40;

	private static final String AUTHORITY = "com.hackathon.contentprovider";

	private static final String PMCANDIDATE_TABLE_BASE_PATH = "pmcandidate";
	private static final String LOCALCANDIDATE_TABLE_BASE_PATH = "localcandidate";

	public static final Uri PMCANDIDATE_TABLE_CONTENT_URI = Uri
			.parse("content://" + AUTHORITY + "/" + PMCANDIDATE_TABLE_BASE_PATH);
	public static final Uri LOCALCANDIDATE_TABLE_CONTENT_URI = Uri
			.parse("content://" + AUTHORITY + "/"
					+ LOCALCANDIDATE_TABLE_BASE_PATH);

	public static final String CONTENT_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE
			+ "/todos";
	public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE
			+ "/todo";
	private static final UriMatcher sURIMatcher = new UriMatcher(
			UriMatcher.NO_MATCH);

	static {
		sURIMatcher.addURI(AUTHORITY, PMCANDIDATE_TABLE_BASE_PATH,
				PMCANDIDATE_TABLE_);
		sURIMatcher.addURI(AUTHORITY, PMCANDIDATE_TABLE_BASE_PATH + "/#",
				PMCANDIDATE_TABLE_ROW);

		sURIMatcher.addURI(AUTHORITY, LOCALCANDIDATE_TABLE_BASE_PATH,
				LOCALCANDIDATE_TABLE_);
		sURIMatcher.addURI(AUTHORITY, LOCALCANDIDATE_TABLE_BASE_PATH + "/#",
				LOCALCANDIDATE_TABLE_ROW);

	}

	@Override
	public boolean onCreate() {

		tableHelper = new DbHelper(getContext());

		return true;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] strings2, String s2) {

		SQLiteQueryBuilder queryBuilder = new SQLiteQueryBuilder();

		// Check if the caller has requested a column which does not exists5
		// checkColumns(projection,uri);

		// Set the table
		// uri.getLastPathSegment()
		String tableName = getTableName(uri.toString());
		// Log.i("table name from  uri", tableName);
		queryBuilder.setTables(tableName);

		SQLiteDatabase database = tableHelper.getWritableDatabase();
		int uriType = sURIMatcher.match(uri);
		switch (uriType) {
		case PMCANDIDATE_TABLE_:
			break;
		case PMCANDIDATE_TABLE_ROW:
			queryBuilder.appendWhere(PMCandidate.COLUMN__ID + "="
					+ uri.getLastPathSegment());
			break;
		case LOCALCANDIDATE_TABLE_:
			break;
		case LOCALCANDIDATE_TABLE_ROW:
			queryBuilder.appendWhere(LocalCandidate.COLUMN__ID + "="
					+ uri.getLastPathSegment());
			break;

		default:
			throw new IllegalArgumentException("Unknown URI: " + uri);
		}

		Cursor cursor = queryBuilder.query(database, projection, selection,
				strings2, null, null, s2);
		cursor.setNotificationUri(getContext().getContentResolver(), uri);

		return cursor;
	}

	@Override
	public String getType(Uri uri) {
		return null;
	}

	@Override
	public Uri insert(Uri uri, ContentValues contentValues) {
		int uriType = sURIMatcher.match(uri);
		SQLiteDatabase sqlDB = tableHelper.getWritableDatabase();
		String basePath;
		// int rowsDeleted = 0;
		long id;
		switch (uriType) {
		case PMCANDIDATE_TABLE_:
			id = sqlDB.insert(PMCandidate.TABLE_NAME, null, contentValues);
			basePath = PMCANDIDATE_TABLE_BASE_PATH;
			break;
		case LOCALCANDIDATE_TABLE_:
			id = sqlDB.insert(LocalCandidate.TABLE_NAME, null, contentValues);
			basePath = LOCALCANDIDATE_TABLE_BASE_PATH;
			break;

		default:
			throw new IllegalArgumentException("Unknown URI: " + uri);
		}
		getContext().getContentResolver().notifyChange(uri, null);
		return Uri.parse(basePath + "/" + id);

	}

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		int uriType = sURIMatcher.match(uri);
		SQLiteDatabase sqlDB = tableHelper.getWritableDatabase();
		int rowsDeleted;
		String id;
		switch (uriType) {
		case PMCANDIDATE_TABLE_:
			rowsDeleted = sqlDB.delete(PMCandidate.TABLE_NAME, selection,
					selectionArgs);
			break;
		case PMCANDIDATE_TABLE_ROW:
			id = uri.getLastPathSegment();
			if (TextUtils.isEmpty(selection)) {
				rowsDeleted = sqlDB.delete(PMCandidate.TABLE_NAME,
						PMCandidate.TABLE_NAME + "=" + id, null);
			} else {
				rowsDeleted = sqlDB
						.delete(PMCandidate.TABLE_NAME, PMCandidate.TABLE_NAME
								+ "=" + id + " and " + selection, selectionArgs);
			}
			break;
		case LOCALCANDIDATE_TABLE_:
			rowsDeleted = sqlDB.delete(LocalCandidate.TABLE_NAME, selection,
					selectionArgs);
			break;
		case LOCALCANDIDATE_TABLE_ROW:
			id = uri.getLastPathSegment();
			if (TextUtils.isEmpty(selection)) {
				rowsDeleted = sqlDB.delete(LocalCandidate.TABLE_NAME,
						LocalCandidate.TABLE_NAME + "=" + id, null);
			} else {
				rowsDeleted = sqlDB.delete(LocalCandidate.TABLE_NAME,
						LocalCandidate.TABLE_NAME + "=" + id + " and "
								+ selection, selectionArgs);
			}
			break;

		default:
			throw new IllegalArgumentException("Unknown URI: " + uri);
		}
		getContext().getContentResolver().notifyChange(uri, null);
		return rowsDeleted;

	}

	@Override
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {

		int uriType = sURIMatcher.match(uri);
		SQLiteDatabase sqlDB = tableHelper.getWritableDatabase();
		int rowsUpdated;
		String id;
		switch (uriType) {
		case PMCANDIDATE_TABLE_:
			rowsUpdated = sqlDB.update(PMCandidate.TABLE_NAME, values,
					selection, selectionArgs);
			break;
		case PMCANDIDATE_TABLE_ROW:
			id = uri.getLastPathSegment();
			if (TextUtils.isEmpty(selection)) {
				rowsUpdated = sqlDB.update(PMCandidate.TABLE_NAME, values,
						PMCandidate.COLUMN__ID + "=" + id, null);
			} else {
				rowsUpdated = sqlDB
						.update(PMCandidate.TABLE_NAME, values,
								PMCandidate.TABLE_NAME + "=" + id + " and "
										+ selection, selectionArgs);
			}
			break;
		case LOCALCANDIDATE_TABLE_:
			rowsUpdated = sqlDB.update(LocalCandidate.TABLE_NAME, values,
					selection, selectionArgs);
			break;
		case LOCALCANDIDATE_TABLE_ROW:
			id = uri.getLastPathSegment();
			if (TextUtils.isEmpty(selection)) {
				rowsUpdated = sqlDB.update(LocalCandidate.TABLE_NAME, values,
						LocalCandidate.COLUMN__ID + "=" + id, null);
			} else {
				rowsUpdated = sqlDB.update(LocalCandidate.TABLE_NAME, values,
						LocalCandidate.COLUMN__ID + "=" + id + " and "
								+ selection, selectionArgs);
			}
			break;

		default:
			throw new IllegalArgumentException("Unknown URI: " + uri);
		}
		getContext().getContentResolver().notifyChange(uri, null);
		return rowsUpdated;
	}

	private void checkColumns(String[] projection, int uri) {
		String[] available = null;
		// switch (uri) {
		/*
		 * available = new
		 * String[PMCandidate.COLUMN__ID,PMCandidate.COLUMN_CHANEL_ID,
		 * PMCandidate.COLUMN_NAME,
		 * PMCandidate.COLUMN_ICON,PMCandidate.COLUMN_CATEGORY,
		 * PMCandidate.COLUMN_GENRE,PMCandidate.COLUMN_DESC, PMCandidate
		 * .COLUMN_LANGUAGE,PMCandidate.COLUMN_CHANEL_NO,PMCandidate
		 * .COLUMN_CHANEL_RANK ];
		 */

		// }

		if (projection != null) {
			HashSet<String> requestedColumns = new HashSet<String>(
					Arrays.asList(projection));
			HashSet<String> availableColumns = new HashSet<String>(
					Arrays.asList(available));
			// Check if all columns which are requested are available
			if (!availableColumns.containsAll(requestedColumns)) {
				throw new IllegalArgumentException(
						"Unknown columns in projection");
			}
		}
	}

	private String getTableName(Uri uri) {
		String uriLastPathSegment = uri.getLastPathSegment();
		String tableName = null;
		if (uriLastPathSegment.equals(PMCANDIDATE_TABLE_BASE_PATH)) {
			tableName = PMCandidate.TABLE_NAME;
		} else if (uriLastPathSegment.equals(LOCALCANDIDATE_TABLE_BASE_PATH)) {
			tableName = LocalCandidate.TABLE_NAME;
		}
		return tableName;
	}

	private String getTableName(String myString) {

		String tableName = null;
		if (myString.contains(PMCANDIDATE_TABLE_BASE_PATH)) {
			tableName = PMCandidate.TABLE_NAME;
		} else if (myString.contains(LOCALCANDIDATE_TABLE_BASE_PATH)) {
			tableName = LocalCandidate.TABLE_NAME;
		}
		return tableName;

	}

}
