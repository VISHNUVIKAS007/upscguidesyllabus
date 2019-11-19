package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Statistics extends AppCompatActivity {
    private TextView mstatisticsHeader;
    private TextView mstatisticsDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        mstatisticsHeader=findViewById(R.id.statisticsH);
        mstatisticsDetail=findViewById(R.id.statisticsDetails);

        mstatisticsHeader.setText(getResources().getString(R.string.statisticsHeader));
        mstatisticsDetail.setText(getResources().getString(R.string.statisticsDetails));
    }
}
