package com.example.dubbakahwk6droid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splashscreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		Handler h = new Handler();
		h.postDelayed(new HomeScreenActivator(), 3000);	
	}
	class HomeScreenActivator implements Runnable 
	{
	public void run() 
	{
	startActivity(new Intent( getApplication(), Homescreen.class) );
	
	finish();
	}
	}
	}



