package com.hackathon.app.utils;

public class Candidate {

	private String mName;
	private String mParty;
	private String ImagePath;
	private String Manifesto;
	private float mRating;
	private float mNumber;

	public Candidate(String name, String image, String party, String manifesto,
			float rating, float number) {
		mName = name;
		mParty = party;
		ImagePath = image;
		Manifesto = manifesto;
		mRating = rating;
		mNumber = number;

	}

	public float getRating() {
		return mRating;
	}

	public void setRating(float rating) {
		this.mRating = rating;
	}

	public float getNumber() {
		return mNumber;
	}

	public void setNumber(float number) {
		this.mNumber = number;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmParty() {
		return mParty;
	}

	public void setmParty(String mParty) {
		this.mParty = mParty;
	}

	public String getImagePath() {
		return ImagePath;
	}

	public void setImagePath(String imagePath) {
		ImagePath = imagePath;
	}

	public String getManifesto() {
		return Manifesto;
	}

	public void setManifesto(String manifesto) {
		Manifesto = manifesto;
	}

}
