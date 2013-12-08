package com.codelearn.hellocodelearn;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class CodeLearnMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_code_learn_main);
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.code_learn_main, menu);
		return true;
	}
	
	@Override
	protected void onStop() {
		Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_LONG).show();
		super.onStop();
		
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "on Destroy", Toast.LENGTH_LONG).show();
		super.onDestroy();
	}

}
