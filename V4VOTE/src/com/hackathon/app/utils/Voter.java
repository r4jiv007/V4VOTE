package com.hackathon.app.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class Voter {

	private static String mName;
	private static String mConstituency;
	private static int mAge;
	private static String mSex;

	public static String getmName() {
		return mName;
	}

	public static void setmName(String mName) {
		mName = mName;
	}

	public static String getmConstituency() {
		return mConstituency;
	}

	public static void setmConstituency(String mConstituency) {
		mConstituency = mConstituency;
	}

	public static int getmAge() {
		return mAge;
	}

	public static void setmAge(int mAge) {
		mAge = mAge;
	}

	public static String getmSex() {
		return mSex;
	}

	public static void setmSex(String mSex) {
		mSex = mSex;
	}

	public static void loadVoterData(Context context) {
		SharedPreferences sharedPref = context.getSharedPreferences(
				"hackathon", Context.MODE_PRIVATE);

		mName = sharedPref.getString("name", null);
		mAge = sharedPref.getInt("age", -1);
		mConstituency = sharedPref.getString("consti", null);
		mSex = sharedPref.getString("sex", null);

	}

	public static void saveVoterData(Context context) {
		SharedPreferences sharedPref = context.getSharedPreferences(
				"hackathon", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPref.edit();
		if (mName != null) {
			editor.putString("name", mName);
		}

		if (mAge >= 18) {
			editor.putInt("age", mAge);
		}

		if (mConstituency != null) {
			editor.putString("consti", mConstituency);
		}

		if (mSex != null) {
			editor.putString("sex", mSex);
		}
	}

}
