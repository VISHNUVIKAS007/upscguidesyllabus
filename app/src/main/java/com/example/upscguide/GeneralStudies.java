package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GeneralStudies extends AppCompatActivity {
    private TextView mPrelimsGSH;
    private  TextView mPrelimsGSD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_studies);

        mPrelimsGSH=findViewById(R.id.prelimsGsHeader);
        mPrelimsGSD=findViewById(R.id.prelimsGsDetails);


        mPrelimsGSH.setText(getResources().getString(R.string.prelimsGSHeaderString));
        mPrelimsGSD.setText(getResources().getString(R.string.prelimsGSDetailsString));
    }
}
