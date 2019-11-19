package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Botany extends AppCompatActivity {


    private TextView mBotanyHeader;
    private TextView mBotanyDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botany);

        mBotanyHeader=findViewById(R.id.botanyH);
        mBotanyDetail=findViewById(R.id.botanyDetails);

        mBotanyHeader.setText(getResources().getString(R.string.botanyHeader));
        mBotanyDetail.setText(getResources().getString(R.string.botanyDetail));
    }
}
