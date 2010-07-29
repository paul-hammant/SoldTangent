package com.thoughtworks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class BackScreen extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.backscreen);
		
		 ImageView backScreenView = (ImageView)  findViewById(R.id.backScreenImage);
     		backScreenView.setOnClickListener(new OnClickListener() {
				
				public void onClick(View imageView) {
					Intent intent = new Intent(BackScreen.this, HomeScreen.class);
					startActivity(intent);	
					
				}
			});
	}

}
