package com.example.upscguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mAbout;
    private  Button mPrilims;
    private  Button mMains;
    private  Button mOptional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mAbout=findViewById(R.id.aboutTheExam);
        mPrilims=findViewById(R.id.prilims);
        mMains=findViewById(R.id.mains);
        mOptional=findViewById(R.id.optional);

        mAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });

        mPrilims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Prilims.class);
                startActivity(intent);
            }
        });

        mMains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Mains.class);
                startActivity(intent);
            }
        });

        mOptional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Optional.class);
                startActivity(intent);
            }
        });
    }
}
