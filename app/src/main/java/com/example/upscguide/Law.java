package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Law extends AppCompatActivity {

    private TextView mlawHeader;
    private TextView mlawDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law);


        mlawHeader=findViewById(R.id.lawH);
        mlawDetail=findViewById(R.id.lawDetails);

        mlawHeader.setText(getResources().getString(R.string.lawHeader));
        mlawDetail.setText(getResources().getString(R.string.lawDetails));
    }
}
