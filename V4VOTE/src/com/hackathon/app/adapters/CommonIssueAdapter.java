package com.hackathon.app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.com.hackathon.app.R;

public class CommonIssueAdapter extends BaseAdapter {

	String[] mCommonIssues;
	Context mContext;

	public CommonIssueAdapter(Context context, String[] arrays) {
		mCommonIssues = arrays;
		mContext = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mCommonIssues.length;
	}

	@Override
	public Object getItem(int position) {

		return mCommonIssues[position];
	}

	@Override
	public long getItemId(int position) {

		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater ViewInflator = LayoutInflater.from(mContext);
		View view1 = ViewInflator.inflate(R.layout.progress, null);
		TextView issues = (TextView) view1.findViewById(R.id.tvIssues);
		issues.setText(mCommonIssues[position]);
		ProgressBar satisfactionLevel = (ProgressBar) view1
				.findViewById(R.id.pbSatisfactionLevel);
		satisfactionLevel.setMax(100);
		satisfactionLevel.setProgress(13 * position);
		return view1;

	}
}
