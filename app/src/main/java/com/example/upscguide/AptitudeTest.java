package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AptitudeTest extends AppCompatActivity {

    private TextView mAptitudeH;
    private TextView mAptitudeD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude_test);

        mAptitudeH=findViewById(R.id.aptitude);
        mAptitudeD=findViewById(R.id.aptitudeDetails);

        mAptitudeH.setText(getResources().getString(R.string.prelimsAptitudeHeader));
        mAptitudeD.setText(getResources().getString(R.string.prelimsAptitudeDetails));
    }
}
