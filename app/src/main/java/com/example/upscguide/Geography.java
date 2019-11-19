package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Geography extends AppCompatActivity {

    private TextView mgeographyHeader;
    private TextView mgeographyDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography);


        mgeographyHeader=findViewById(R.id.geographyH);
        mgeographyDetail=findViewById(R.id.geographyDetails);

        mgeographyHeader.setText(getResources().getString(R.string.geographyHeader));
        mgeographyDetail.setText(getResources().getString(R.string.geographydetail));
    }
}
