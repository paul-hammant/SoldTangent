package com.thoughtworks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class HomeScreen extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
        
        ImageView homeScreenView = (ImageView)  findViewById(R.id.homeScreenImage);
        	homeScreenView.setOnClickListener(new OnClickListener() {
				
				public void onClick(View imageView) {
					Intent intent = new Intent(HomeScreen.this, BackScreen.class);
					startActivity(intent);	
					
				}
			});
    }
}