package com.example.upscguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mains extends AppCompatActivity {

    private Button mGSone;
    private Button mGStwo;
    private Button mGSthree;
    private Button mGSfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mains);

        mGSone=findViewById(R.id.gs1);
        mGStwo=findViewById(R.id.gs2);
        mGSthree=findViewById(R.id.gs3);
        mGSfour=findViewById(R.id.gs4);

        mGSone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Mains.this,GeneralStudies1.class);
                startActivity(intent);
            }
        });
        mGStwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Mains.this,GeneralStudies2.class);
                startActivity(intent);
            }
        });
        mGSthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Mains.this,GeneralStudies3.class);
                startActivity(intent);
            }
        });
        mGSfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Mains.this,GeneralStudies4.class);
                startActivity(intent);
            }
        });

    }
}
