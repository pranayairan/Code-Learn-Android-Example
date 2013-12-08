package org.codelearn.codelearnactivitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Toast.makeText(getApplicationContext(), "Creating CodeLearn", Toast.LENGTH_SHORT).show();
		
	}

	@Override
	protected void onStart() {
		Toast.makeText(getApplicationContext(), "Starting CodeLearn", Toast.LENGTH_SHORT).show();
		super.onStart();
	}
	
	@Override
	protected void onResume() {
		Toast.makeText(getApplicationContext(), "Resuming CodeLearn", Toast.LENGTH_SHORT).show();
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		Toast.makeText(getApplicationContext(), "Pausing CodeLearn", Toast.LENGTH_SHORT).show();
		super.onPause();
	}
	
	@Override
	protected void onStop() {
		Toast.makeText(getApplicationContext(), "Stopping CodeLearn", Toast.LENGTH_SHORT).show();
		super.onStop();
		
	}
	
	@Override
	protected void onRestart() {
		Toast.makeText(getApplicationContext(), "Restarting CodeLearn", Toast.LENGTH_SHORT).show();
		super.onRestart();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Destroying CodeLearn", Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}
	
	
}
