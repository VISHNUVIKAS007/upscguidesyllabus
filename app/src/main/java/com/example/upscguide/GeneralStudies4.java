package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GeneralStudies4 extends AppCompatActivity {
    private TextView mGS4H;
    private TextView mGS4D;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_studies4);

        mGS4H=findViewById(R.id.mainsGs4Header);
        mGS4D=findViewById(R.id.mainsGs4Details);

        mGS4H.setText(getResources().getString(R.string.gs4Header));
        mGS4D.setText(getResources().getString(R.string.gs4Details));

    }
}
