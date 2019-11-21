package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AppAbout extends AppCompatActivity {

    private TextView mAppAbout;
    private TextView mAppD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_about);


        //mAppAbout=findViewById(R.id.appAboutScreen);
        mAppD=findViewById(R.id.appAboutDetails);

        //mAppAbout.setText(getResources().getString(R.string.appAboutHeader));
        mAppD.setText( getResources().getString(R.string.appAboutDetails));
    }
}
