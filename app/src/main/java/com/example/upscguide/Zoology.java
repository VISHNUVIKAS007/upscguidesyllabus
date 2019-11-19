package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Zoology extends AppCompatActivity {

    private TextView mzoologyHeader;
    private TextView mzoologyDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoology);

        mzoologyHeader=findViewById(R.id.zoologyH);
        mzoologyDetail=findViewById(R.id.zoologyDetails);

        mzoologyHeader.setText(getResources().getString(R.string.zoologyHeader));
        mzoologyDetail.setText(getResources().getString(R.string.zoologyDetails));
    }
}
