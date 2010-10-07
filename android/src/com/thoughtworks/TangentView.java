package com.thoughtworks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class TangentView extends HasInfoButtonView {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.card);
		
		ImageView backScreenView = (ImageView)  findViewById(R.id.cardImage);
        backScreenView.setImageResource(R.drawable.tangent);
        backScreenView.setOnClickListener(new OnClickListener() {

            public void onClick(View imageView) {
                Intent intent = new Intent(TangentView.this, SoldView.class);
                startActivity(intent);

            }
        });
        
        attachInfoButtonOnClick();
	}

}
