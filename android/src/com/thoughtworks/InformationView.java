package com.thoughtworks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class InformationView extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);
        
        ImageView homeScreenView = (ImageView)  findViewById(R.id.cardImage);
        homeScreenView.setImageResource(R.drawable.sold);
        homeScreenView.setOnClickListener(new OnClickListener() {

            public void onClick(View imageView) {
                
            }
        });
    }

}
