package com.echessa.noteapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class NoteAppApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();

		Parse.initialize(this, "HBiktiugAr0udfry8vBSnTCXv7ZXz8mXbzOWSLsu", "XobfKw6hbkbYV0Zn54qY9y2hjZNTZlo2VCXMIFr7");

		ParseObject testObject = new ParseObject("TestObject");
		testObject.put("foo", "bar");
		testObject.saveInBackground();
	}

}
