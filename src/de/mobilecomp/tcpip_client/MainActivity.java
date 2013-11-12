package de.mobilecomp.tcpip_client;

import android.os.Bundle;

import java.util.Scanner;

import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button sendButton;
    OnClickListener sendHandler;
    EditText addressField;
    EditText portField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate:", "activity created");
        
        //Initialize Buttons and EditTexts
        sendButton = (Button) findViewById(R.id.sendButton);
		addressField = (EditText)findViewById(R.id.addressField);
		portField = (EditText)findViewById(R.id.portField);
		
		sendButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
	    		String addressText = addressField.getText().toString();
	    		String portText = portField.getText().toString();
	    		Log.d("OnClick", "click event triggered");

	    		if (addressText.length() == 0 || portText.length() == 0) {
	    			Log.d("no port", "no address");
	    		return;
	    		
	          } else {
		        	startTCP(addressText, portText);       	  
	          }
			}
		});
		
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
     
    public void startTCP(String address, String port) {
    	  Log.d("address: ", address);
    	  Log.d("port: ", port);
      }
      
}
