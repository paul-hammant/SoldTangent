package com.thoughtworks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class SoldView extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card);
        
        ImageView homeScreenView = (ImageView)  findViewById(R.id.cardImage);
        homeScreenView.setImageResource(R.drawable.sold);
        homeScreenView.setOnClickListener(new OnClickListener() {

            public void onClick(View imageView) {
                Intent intent = new Intent(SoldView.this, TangentView.class);
                startActivity(intent);

            }
        });
    }
}