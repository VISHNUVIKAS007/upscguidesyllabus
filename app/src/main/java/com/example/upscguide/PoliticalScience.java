package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PoliticalScience extends AppCompatActivity {
    private TextView mpolityHeader;
    private TextView mpolityDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_political_science);

        mpolityHeader=findViewById(R.id.polityH);
        mpolityDetail=findViewById(R.id.polityDetails);

        mpolityHeader.setText(getResources().getString(R.string.politicalHeader));
        mpolityDetail.setText(getResources().getString(R.string.politicalDetails));
    }
}
