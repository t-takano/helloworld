package com.example.helloworld.test;

import com.example.helloworld.*;
import android.widget.TextView;
import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity activity;
	private TextView view;
	private Object resourceString;
	@SuppressWarnings("deprecation")
	public MainActivityTest() {
		super("com.example.helloworld", MainActivity.class);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
        activity = getActivity();
        view = (TextView) activity.findViewById(com.example.helloworld.R.id.textView);
        resourceString = activity.getString(com.example.helloworld.R.string.hello_world);
	}
	public void testText() throws Exception {
		assertNotNull(view.getText().toString(), resourceString);
	}
}
