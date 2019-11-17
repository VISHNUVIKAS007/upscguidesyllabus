package com.example.upscguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    private Button mSchemes;
    private Button mEligibility;
    private Button mServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        mSchemes=findViewById(R.id.schemes);
        mEligibility=findViewById(R.id.eligibility);
        mServices=findViewById(R.id.services);

        mSchemes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AboutActivity.this, Schemes.class);
                startActivity(intent);
            }
        });

        mEligibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AboutActivity.this,Eligibility.class);
                startActivity(intent);
            }
        });

        mServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AboutActivity.this,Services.class);
                startActivity(intent);
            }
        });
    }
}
