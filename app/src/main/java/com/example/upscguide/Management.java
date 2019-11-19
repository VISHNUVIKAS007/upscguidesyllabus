package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Management extends AppCompatActivity {

    private TextView mmanagenmentHeader;
    private TextView mmanagenmentDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);


        mmanagenmentHeader=findViewById(R.id.managementH);
        mmanagenmentDetail=findViewById(R.id.managementDetails);

        mmanagenmentHeader.setText(getResources().getString(R.string.managementHeader));
        mmanagenmentDetail.setText(getResources().getString(R.string.managementDetails));
    }
}
