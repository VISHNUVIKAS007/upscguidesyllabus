package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sociology extends AppCompatActivity {
    private TextView msociologyHeader;
    private TextView msociologyDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sociology);

        msociologyHeader=findViewById(R.id.sociologyH);
        msociologyDetail=findViewById(R.id.sociologyDetails);

        msociologyHeader.setText(getResources().getString(R.string.sociologyHeader));
        msociologyDetail.setText(getResources().getString(R.string.sociologyDetails));
    }
}
