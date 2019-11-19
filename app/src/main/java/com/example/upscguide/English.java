package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class English extends AppCompatActivity {

    private TextView mEnglishHeader;
    private TextView mEnglishDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);


        mEnglishHeader=findViewById(R.id.englishH);
        mEnglishDetail=findViewById(R.id.englishDetails);

        mEnglishHeader.setText(getResources().getString(R.string.englishHeader));
        mEnglishDetail.setText(getResources().getString(R.string.englishDetail));
    }
}
