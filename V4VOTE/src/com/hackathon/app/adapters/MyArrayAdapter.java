package com.hackathon.app.adapters;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.com.hackathon.app.R;
import com.hackathon.app.utils.Candidate;
import com.hackathon.app.utils.ImageLoader;

public class MyArrayAdapter extends BaseAdapter {

	private ArrayList list;
	private Activity mContext;
	private ImageLoader mImageLoader;
	private int[] mRes;

	public MyArrayAdapter(Activity context, ArrayList<Candidate> list, int[] res) {
		this.list = list;
		mContext = context;
		mImageLoader = new ImageLoader(mContext);
		mRes = res;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		if (list != null)
			return list.size();
		else
			return 0;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		if (list != null) {
			return list.get(arg0);

		} else {
			return null;
		}
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View view, ViewGroup arg2) {
		// TODO Auto-generated method stub
		LayoutInflater ViewInflator = LayoutInflater.from(mContext);
		View view1 = ViewInflator.inflate(R.layout.candidate_row, null);
		TextView tvName = (TextView) view1.findViewById(R.id.tvCandidateName);
		ImageView ivImage = (ImageView) view1
				.findViewById(R.id.ivCandidateImage);

		Candidate cn = (Candidate) list.get(arg0);
		tvName.setText(cn.getmName());
		// mImageLoader.DisplayImage(cn.getImagePath(), mContext, ivImage);
		ivImage.setImageResource(mRes[arg0]);
		return view1;
	}

}
