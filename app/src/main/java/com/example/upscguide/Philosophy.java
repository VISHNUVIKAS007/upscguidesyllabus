package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Philosophy extends AppCompatActivity {

    private TextView mphilosophyHeader;
    private TextView mphilosophyDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philosophy);

        mphilosophyHeader=findViewById(R.id.philosophyH);
        mphilosophyDetail=findViewById(R.id.philosophyDetails);

        mphilosophyHeader.setText(getResources().getString(R.string.philosophyHeader));
        mphilosophyDetail.setText(getResources().getString(R.string.philosophyDetails));
    }
}
