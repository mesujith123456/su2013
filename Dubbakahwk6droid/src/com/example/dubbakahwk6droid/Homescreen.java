package com.example.dubbakahwk6droid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class Homescreen extends Activity
{
	
	  private static final int request_code=0;
	
	  public class ButtonHandler implements View.OnClickListener
	  {
		 
		  public void onClick(View v)
		  {
			  handleButtonClick();
		  }
	  }
	  private void handleButtonClick()
	  {
		  startActivityForResult(new Intent(this, Configprefer.class), request_code);
	  }	
		
	  public void onCreate(Bundle savedInstanceState)
		 {
			  
			    super.onCreate(savedInstanceState);
			    setContentView(R.layout.homescreen);
			   final Button ConfigurePreferences= (Button)findViewById(R.id.configpreferbutton);
			   ConfigurePreferences.setOnClickListener(new ButtonHandler());
			     }
	  
	 protected void onActvityResult(int requestCode, int resultCode, Intent data)
	 {
		 super.onActivityResult(requestCode, resultCode, data);
		 if(resultCode==Activity.RESULT_CANCELED)
		 {
			 Toast.makeText(this, "activity cancelled", Toast.LENGTH_SHORT).show();
		 }
		 else if(resultCode==Activity.RESULT_OK)
		 {
		    	String input = data.getStringExtra("input");
		 		Toast.makeText(Homescreen.this,"settings saved for "+ input, Toast.LENGTH_SHORT).show();
		 		
		 }
		 }	
		 		
	 }


	

	