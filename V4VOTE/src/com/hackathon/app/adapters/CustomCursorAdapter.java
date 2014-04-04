package com.hackathon.app.adapters;

import android.app.Activity;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.com.hackathon.app.R;
import com.hackathon.app.utils.ImageLoader;

public class CustomCursorAdapter extends BaseAdapter {

	private Cursor mCursor;
	private Activity mContext;
	private ImageLoader mImageLoader;

	public CustomCursorAdapter(Activity context, Cursor cursor) {
		mCursor = cursor;
		mContext = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		if (mCursor != null)
			return mCursor.getCount();
		else
			return 0;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		if (mCursor != null) {
			return mCursor.moveToPosition(arg0);

		} else {
			return null;
		}
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void swapCursor(Cursor cursor) {
		mCursor = cursor;
		notifyDataSetChanged();
	}

	@Override
	public View getView(int arg0, View view, ViewGroup arg2) {
		// TODO Auto-generated method stub
		LayoutInflater ViewInflator = LayoutInflater.from(mContext);
		view = ViewInflator.inflate(R.layout.candidate_row, null);
		TextView tvName = (TextView) view.findViewById(R.id.tvCandidateName);
		ImageView ivImage = (ImageView) view
				.findViewById(R.id.ivCandidateImage);

		mCursor.moveToPosition(arg0);
		tvName.setText(mCursor.getString(mCursor.getColumnIndex("name")));
		mImageLoader.DisplayImage(
				mCursor.getString(mCursor.getColumnIndex("image")), mContext,
				ivImage);
		return view;
	}

}
