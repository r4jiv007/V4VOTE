/*
 * Copyright 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hackathon.app.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.com.hackathon.app.R;
import com.hackathon.app.adapters.CommonIssueAdapter;

public class DetailActivity extends Activity {

	private String[] issues = { "Women Empowerment", "Education",
			"Health and Sanitation", "Corruption",
			"Technology and Infrastructure" };
	CommonIssueAdapter mAdapter;
	ListView mListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rate_fragment);
		mListView=(ListView)findViewById(R.id.rateList);
		mAdapter = new CommonIssueAdapter(this, issues);
		mListView.setAdapter(mAdapter);

	}
}
