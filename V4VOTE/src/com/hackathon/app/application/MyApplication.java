package com.hackathon.app.application;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Application;

import com.hackathon.app.utils.Candidate;

public class MyApplication extends Application {

	public static ArrayList<Candidate> nationalList = new ArrayList<Candidate>();
	public static ArrayList<Candidate> localList = new ArrayList<Candidate>();
	public static HashMap<String, String> partyMenefesto = new HashMap<String, String>();

}
