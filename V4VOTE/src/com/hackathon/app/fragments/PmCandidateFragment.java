package com.hackathon.app.fragments;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.example.com.hackathon.app.R;
import com.hackathon.app.adapters.MyArrayAdapter;
import com.hackathon.app.application.MyApplication;
import com.hackathon.app.interfaces.onCandidateSelectListener;
import com.hackathon.app.utils.Candidate;

public class PmCandidateFragment extends Fragment implements
		LoaderManager.LoaderCallbacks<Cursor> {

	onCandidateSelectListener mCandidateListener;
	MyArrayAdapter mAdapter;
	private ListView listView;
	int[] res = { R.drawable.narendra, R.drawable.arvind, R.drawable.rahul

	};

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		mCandidateListener = (onCandidateSelectListener) activity;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.cadidate_list, container, false);
		listView = (ListView) view.findViewById(R.id.lvCandidateList);
		mAdapter = new MyArrayAdapter(getActivity(),
				MyApplication.nationalList, res);
		listView.setAdapter(mAdapter);
		setListener();
		return view;

	}

	private void setListener() {
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapter, View v,
					int position, long arg3) {

				Candidate cn = MyApplication.nationalList.get(position);
				mCandidateListener.onCandidateSelected(cn);
			}
		});
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		// getActivity().getSupportLoaderManager().initLoader(0, null, this);

	}

	@Override
	public Loader<Cursor> onCreateLoader(int arg0, Bundle arg1) {

		// return new CursorLoader(getActivity(),
		// AppContentProvider.PMCANDIDATE_TABLE_CONTENT_URI, null, null,
		// null, null);
		return null;
	}

	@Override
	public void onLoadFinished(Loader<Cursor> arg0, Cursor cursor) {

		// mAdapter.swapCursor(cursor);
	}

	@Override
	public void onLoaderReset(Loader<Cursor> arg0) {

		// mAdapter.swapCursor(null);
	}

}
