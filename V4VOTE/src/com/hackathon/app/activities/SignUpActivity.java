package com.hackathon.app.activities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.com.hackathon.app.R;

public class SignUpActivity extends Activity {

	private EditText etName, etConsti, etAge;
	private RadioGroup mSexGroup;
	private RadioButton rbMale, rbFemale;
	private Button bSubmit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_up);
		initView();
	}

	private void initView() {
		etName = (EditText) findViewById(R.id.signup_name);
		etConsti = (EditText) findViewById(R.id.signup_constituency);
		mSexGroup = (RadioGroup) findViewById(R.id.radiosex);
		rbMale = (RadioButton) findViewById(R.id.signup_gender_male);
		rbMale.setChecked(true);
		rbFemale = (RadioButton) findViewById(R.id.signup_gender_female);
		etAge = (EditText) findViewById(R.id.signup_age);
		bSubmit = (Button) findViewById(R.id.signup_btn);
		setListener();
	}

	private void setListener() {
		bSubmit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				String name = etName.getText().toString();
				String consti = etConsti.getText().toString();
				String sex = ((rbMale.isChecked()) ? "M" : "F");
				String age = etAge.getText().toString();
				String validateResult = checkDetails(name, consti, sex, age);

				if (validateResult != null) {
					Toast.makeText(getApplicationContext(), validateResult,
							Toast.LENGTH_LONG).show();
				} else {
					new PostDetails(name, consti, sex, age).execute();
					// postDetails(name, consti, sex, age);
				}
			}
		});
	}

	public boolean postData(String name, String consti, String age, String sex) {
		// Create a new HttpClient and Post Header
		HttpClient httpclient = new DefaultHttpClient();
		HttpPost httppost = new HttpPost("http://192.168.43.42/vote/indexjson.php");

		try {
			// Add your data
			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
			nameValuePairs.add(new BasicNameValuePair("name", name));
			nameValuePairs.add(new BasicNameValuePair("const", consti));
			nameValuePairs.add(new BasicNameValuePair("age", age));
			nameValuePairs.add(new BasicNameValuePair("sex", sex));
			// nameValuePairs.add(new BasicNameValuePair("deviceid", Utility
			// .getDeviceName()));
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

			// Execute HTTP Post Request
			HttpResponse response = httpclient.execute(httppost);

			int code = response.getStatusLine().getStatusCode();
			if (code == 200) {
				return true;
			} else {
				return false;
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		return false;
	}

	private String checkDetails(String name, String consti, String sex,
			String age) {
		if (name == null) {
			return "Please Enter Proper Name";
		} else if (consti == null) {
			return "Please Enter your Constituency Name";
		} else if (sex == null) {
			return "Please Enter Valid Sex";
		} else if (Integer.parseInt(age) < 18) {
			return "Make sure you are more than 18 years Old";
		}

		return null;
	}

	private class PostDetails extends AsyncTask<Void, Void, Void> {
		String name, consti, sex, age;
		boolean postVal = false;

		public PostDetails(String name, String consti, String sex, String age) {
			this.name = name;
			this.consti = consti;
			this.sex = sex;
			this.age = age;
		}

		@Override
		protected Void doInBackground(Void... arg0) {

			postVal = postData(name, consti, sex, age);

			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
			if (postVal) {
				Toast.makeText(getApplicationContext(),
						"Details Posted Successfully", Toast.LENGTH_LONG)
						.show();
				Intent in = new Intent(getApplicationContext(),
						MainActivity.class);
				startActivity(in);
				SignUpActivity.this.finish();
			} else {
				Toast.makeText(getApplicationContext(),
						"Details Posting Failed", Toast.LENGTH_LONG).show();
			}
		}

	}
}
