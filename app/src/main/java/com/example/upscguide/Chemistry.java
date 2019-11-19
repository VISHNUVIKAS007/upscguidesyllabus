package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Chemistry extends AppCompatActivity {


    private TextView mChemiatry;
    private TextView mChemistryDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry);

        mChemiatry=findViewById(R.id.chemistryH);
        mChemistryDetail=findViewById(R.id.chemistryDetails);

        mChemiatry.setText(getResources().getString(R.string.chemisryHeader));
        mChemistryDetail.setText(getResources().getString(R.string.chemistryDetail));
    }
}
