package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Geology extends AppCompatActivity {

    private TextView mgeologyHeader;
    private TextView mgeologyDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geology);


        mgeologyHeader=findViewById(R.id.geologyH);
        mgeologyDetail=findViewById(R.id.geologyDetails);

        mgeologyHeader.setText(getResources().getString(R.string.geologyHeader));
        mgeologyDetail.setText(getResources().getString(R.string.geologyDetail));
    }
}
