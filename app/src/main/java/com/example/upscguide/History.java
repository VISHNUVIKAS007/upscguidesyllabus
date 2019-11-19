package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class History extends AppCompatActivity {

    private TextView mhistoryHeader;
    private TextView mhistoryDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);


        mhistoryHeader=findViewById(R.id.historyH);
        mhistoryDetail=findViewById(R.id.historyDetails);

        mhistoryHeader.setText(getResources().getString(R.string.historyHeader));
        mhistoryDetail.setText(getResources().getString(R.string.historyDetails));
    }
}
