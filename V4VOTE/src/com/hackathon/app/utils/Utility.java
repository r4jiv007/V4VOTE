package com.hackathon.app.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;

public class Utility {

	public static void CopyStream(InputStream is, OutputStream os) {
		final int buffer_size = 1024;
		try {
			byte[] bytes = new byte[buffer_size];
			for (;;) {
				int count = is.read(bytes, 0, buffer_size);
				if (count == -1)
					break;
				os.write(bytes, 0, count);
			}
		} catch (Exception ex) {
		}
	}

	public static String getDeviceName() {
		String manufacturer = Build.MANUFACTURER;
		String model = Build.MODEL;
		if (model.startsWith(manufacturer)) {
			return capitalize(model);
		} else {
			return capitalize(manufacturer) + " " + model;
		}
	}

	private static String capitalize(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
		char first = s.charAt(0);
		if (Character.isUpperCase(first)) {
			return s;
		} else {
			return Character.toUpperCase(first) + s.substring(1);
		}
	}

	public static String getEmailID(Context context) {
		AccountManager manager = AccountManager.get(context);
		Account[] list = manager.getAccounts();
		String gmail = null;

		for (Account account : list) {
			if (account.type.equalsIgnoreCase("com.google")) {
				gmail = account.name;
				break;
			}
		}
		return gmail;
	}
	
	public static JSONArray doGet(String string, boolean docaching)
			throws IOException, JSONException {
		Log.i("Tag doGet", "making HTTP GET req");
		Log.i("Url :", string + "");
		// enableHttpCaching(context);
		URL url = new URL(string);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setUseCaches(docaching);
		con.setRequestMethod("GET");
		InputStream is = con.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();
		String input;
		while ((input = br.readLine()) != null) {
			sb.append(input);
		}
		// Log.i("Tag jsonArray: ", sb.toString());
		return new JSONArray(sb.toString());
	}
}
