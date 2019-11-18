package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GeneralStudies2 extends AppCompatActivity {

    private TextView mGS2H;
    private  TextView mGS2D;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_studies2);

        mGS2H=findViewById(R.id.mainsGs2Header);
        mGS2D= findViewById(R.id.mainsGs2Details);

        mGS2H.setText(getResources().getString(R.string.gs2Header));
        mGS2D.setText(getResources().getString(R.string.gs2Detail));
    }
}
