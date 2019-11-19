package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AppAbout extends AppCompatActivity {

    private TextView mAppAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_about);

        mAppAbout=findViewById(R.id.appAboutScreen);

        mAppAbout.setText(getResources().getString(R.string.appAboutHeader));
    }
}
