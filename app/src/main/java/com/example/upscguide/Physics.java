package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Physics extends AppCompatActivity {
    private TextView mphysicsHeader;
    private TextView mphysicsDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);

        mphysicsHeader=findViewById(R.id.physicsH);
        mphysicsDetail=findViewById(R.id.physicsDetails);

        mphysicsHeader.setText(getResources().getString(R.string.physicsHeader));
        mphysicsDetail.setText(getResources().getString(R.string.physicsDetails));
    }
}
