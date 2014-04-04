package com.hackathon.app.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

import com.example.com.hackathon.app.R;
import com.hackathon.app.networkcalls.PmDataFetchService;

public class SplashScreen extends Activity {

	private Handler mSplashHandler;
	private Runnable mSplashRunnable;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spalsh_screen);
		prefetch();
		launchNextScreen();
	}

	private void prefetch() {
		Intent in = new Intent(this, PmDataFetchService.class);
		startService(in);
	}

	private void launchNextScreen() {
		mSplashHandler = new Handler();
		mSplashRunnable = new Runnable() {

			@Override
			public void run() {
				Intent SignUpIntent = new Intent(getApplicationContext(),
						SignUpActivity.class);
				startActivity(SignUpIntent);

			}
		};

		mSplashHandler.postDelayed(mSplashRunnable, 3000);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
