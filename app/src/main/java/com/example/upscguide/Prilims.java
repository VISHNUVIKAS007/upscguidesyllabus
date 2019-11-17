package com.example.upscguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Prilims extends AppCompatActivity {


    Button mGeneralStudies;
    Button mAptitudeTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prilims);

        mGeneralStudies=findViewById(R.id.generalStudies);
        mAptitudeTest=findViewById(R.id.aptitudeTest);

        mGeneralStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Prilims.this,GeneralStudies.class);
                startActivity(intent);
            }
        });

        mAptitudeTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Prilims.this,AptitudeTest.class);
                startActivity(intent);
            }
        });
    }
}
