package com.thoughtworks;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class HasInfoButtonView extends Activity {

	protected void attachInfoButtonOnClick() {
		((ImageButton)findViewById(R.id.informationButton)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Start the Information Activity.
				try{
					startActivity(new Intent(HasInfoButtonView.this, InformationView.class));
				}
				catch(Exception e){
					e.printStackTrace();
				}

				
			}
		});
	}

}
