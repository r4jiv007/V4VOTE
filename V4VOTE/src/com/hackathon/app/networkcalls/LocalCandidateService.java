package com.hackathon.app.networkcalls;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.hackathon.app.application.MyApplication;
import com.hackathon.app.utils.Candidate;
import com.hackathon.app.utils.Utility;

import android.app.IntentService;
import android.content.ContentValues;
import android.content.Intent;

public class LocalCandidateService extends IntentService {

	public LocalCandidateService() {
		super("localCandidate");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		String url = "http://192.168.43.42/vote/candi.php";

		try {
			JSONArray jArray = Utility.doGet(url, false);
			for (int i = 0; i < jArray.length(); i++) {
				JSONObject jObj = jArray.getJSONObject(i);
				// TVBuddyApp.urlStrings.add(jObj.getString("icon"));

				ContentValues cv = new ContentValues();
				Candidate cn = new Candidate(jObj.getString("name"),
						jObj.getString("path"), jObj.getString("party"),
						jObj.getString("manifesto"), Float.parseFloat(jObj
								.getString("rating")), Float.parseFloat(jObj
								.getString("numb")));
				MyApplication.nationalList.add(cn);
				// Uri uri =
				// getApplicationContext().getContentResolver().insert(
				// AppContentProvider.PMCANDIDATE_TABLE_CONTENT_URI, cv);
				// Log.i("parsing JSON", uri.toString());

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
