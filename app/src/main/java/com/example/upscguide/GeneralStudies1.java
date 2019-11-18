package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GeneralStudies1 extends AppCompatActivity {

    private TextView mGs1H;
    private  TextView mGs1D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_studies1);

        mGs1H=findViewById(R.id.mainsGs1Header);
        mGs1D=findViewById(R.id.mainsGs1Details);

        mGs1H.setText(getResources().getString(R.string.gs1header));
        mGs1D.setText(getResources().getString(R.string.gs1details));
    }
}
