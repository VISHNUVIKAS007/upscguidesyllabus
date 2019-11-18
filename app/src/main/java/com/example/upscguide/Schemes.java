package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Schemes extends AppCompatActivity {

    TextView mPrelimsH;
    TextView mPrelimsD;
    TextView mMainsH;
    TextView mMainsD;
    TextView mMarks;
    TextView mInterviewH;
    TextView mInterviewD;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes);

       mPrelimsH=findViewById(R.id.prilimsHeading);
        mPrelimsD=findViewById(R.id.prilimsDetails);
        mMainsH=findViewById(R.id.mainsHeading);
        mMainsD=findViewById(R.id.mainsDetails);
        mInterviewH=findViewById(R.id.personalityTest);
        mInterviewD=findViewById(R.id.personalityTestDetails);
        mMarks=findViewById(R.id.marks);

       mPrelimsH.setText(getResources().getString(R.string.prelims));
        mPrelimsD.setText(getResources().getString(R.string.prilimsdetails));
        mMainsH.setText(getResources().getString(R.string.mainsHeading));
        mMainsD.setText(getResources().getString(R.string.mainsDetails));
        mInterviewH.setText(getResources().getString(R.string.interviewHeading));
        mInterviewD.setText(getResources().getString(R.string.interviewDetails));
        mMarks.setText(getResources().getString(R.string.marks));
    }
}
