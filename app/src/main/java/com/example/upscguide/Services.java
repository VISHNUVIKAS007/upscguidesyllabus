package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Services extends AppCompatActivity {

    private TextView mServicesH;
    private TextView mServicesD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        mServicesH=findViewById(R.id.servicesHeader);
        mServicesD=findViewById(R.id.servicesDetails);

        mServicesH.setText(getResources().getString(R.string.servicesHeader));
        mServicesD.setText(getResources().getString(R.string.servicesDetails));
    }
}
