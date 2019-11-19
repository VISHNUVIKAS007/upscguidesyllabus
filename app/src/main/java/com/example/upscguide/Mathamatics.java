package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Mathamatics extends AppCompatActivity {

    private TextView mmathsHeader;
    private TextView mmathsDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathamatics);


        mmathsHeader=findViewById(R.id.mathsH);
        mmathsDetail=findViewById(R.id.mathsDetails);

        mmathsHeader.setText(getResources().getString(R.string.mathsHeader));
        mmathsDetail.setText(getResources().getString(R.string.mathsDetails));
    }
}
