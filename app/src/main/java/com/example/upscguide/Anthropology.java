package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Anthropology extends AppCompatActivity {

    private TextView mAnthroHeader;
    private TextView mAnthroDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anthropology);

        mAnthroHeader=findViewById(R.id.anthropologyH);
        mAnthroDetail=findViewById(R.id.anthropologyDetails);

        mAnthroHeader.setText(getResources().getString(R.string.anthropologyHeader));
        mAnthroDetail.setText(getResources().getString(R.string.animalDetails));
    }
}
