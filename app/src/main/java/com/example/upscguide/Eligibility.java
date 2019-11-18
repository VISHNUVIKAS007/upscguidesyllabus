package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Eligibility extends AppCompatActivity {

    private TextView mEligibility;
    private TextView mEligibilityDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eligibility);

        mEligibility=findViewById(R.id.eligibility);
        mEligibilityDetails=findViewById(R.id.eligibilityDetails);

        mEligibility.setText(getResources().getString(R.string.EligibilityHeading));
        mEligibilityDetails.setText(getResources().getString(R.string.EligibilityDetails));
    }
}
