package com.thoughtworks;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class InformationView extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);
        
        findViewById(R.id.informationView).setOnClickListener(new OnClickListener() {

            public void onClick(View imageView) {
                finish();
            }
        });
    }

}
