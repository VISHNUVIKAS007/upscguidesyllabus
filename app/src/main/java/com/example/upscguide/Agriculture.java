package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Agriculture extends AppCompatActivity {

    private TextView mAgriHeader;
    private TextView mAgriDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture);

        mAgriHeader=findViewById(R.id.agriH);
        mAgriDetail=findViewById(R.id.agriDetails);

        mAgriHeader.setText(getResources().getString(R.string.agricultureHeader));
        mAgriDetail.setText(getResources().getString(R.string.agricultureDetails));
    }
}
