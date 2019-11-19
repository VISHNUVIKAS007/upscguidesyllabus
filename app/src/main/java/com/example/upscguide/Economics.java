package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Economics extends AppCompatActivity {

    private TextView mEconomicsHeader;
    private TextView mEconomicsDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economics);


        mEconomicsHeader=findViewById(R.id.economicsH);
        mEconomicsDetail=findViewById(R.id.economicsDetails);

        mEconomicsHeader.setText(getResources().getString(R.string.economicsHeader));
        mEconomicsDetail.setText(getResources().getString(R.string.economicsDetail));
    }
}
