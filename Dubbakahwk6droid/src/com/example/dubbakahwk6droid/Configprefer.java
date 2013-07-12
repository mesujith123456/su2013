package com.example.dubbakahwk6droid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Configprefer extends Activity {
	
	private class ButtonHandler implements View.OnClickListener
	{
		public void onClick(View v)
		{
			handleButtonClick();
		}
	}
	     
	private void handleButtonClick()
	{
		Intent data= new Intent();

		final EditText textEmailAddress = (EditText)findViewById(R.id.editText1);
		data.putExtra("input",textEmailAddress.getText().toString());
		setResult(Activity.RESULT_OK, data);
		finish();
	
	}
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.configprefer);
		final Button SaveSettings = (Button)findViewById(R.id.saveset);
		SaveSettings.setOnClickListener(new ButtonHandler());
	}


}