package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GeneralStudies3 extends AppCompatActivity {
    private TextView mGS3H;
    private TextView mGS3D;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_studies3);
        mGS3H=findViewById(R.id.mainsGs3Header);
        mGS3D=findViewById(R.id.mainsGs3Details);

        mGS3H.setText(getResources().getString(R.string.gs3Header));
        mGS3D.setText(getResources().getString(R.string.gs3Details));
    }
}
