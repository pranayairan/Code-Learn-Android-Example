package org.codelearn.codelearnhellointents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Activity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity2);
		
		Intent intentObject = getIntent();
		String userName = intentObject.getStringExtra("UserName");
		boolean isRegistered = intentObject.getBooleanExtra("isRegistered", true);
	}



}
