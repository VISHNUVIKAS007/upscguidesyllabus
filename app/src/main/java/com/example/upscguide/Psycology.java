package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Psycology extends AppCompatActivity {
    private TextView mpsycologyHeader;
    private TextView mpsycologyDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psycology);

        mpsycologyHeader=findViewById(R.id.psycologyH);
        mpsycologyDetail=findViewById(R.id.psycologyDetails);

        mpsycologyHeader.setText(getResources().getString(R.string.psychologyHeader));
        mpsycologyDetail.setText(getResources().getString(R.string.psychologyDetails));
    }
}
