package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Commerce extends AppCompatActivity {

    private TextView mCommerceHeader;
    private TextView mCommerceDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerce);


        mCommerceHeader=findViewById(R.id.commerceH);
        mCommerceDetail=findViewById(R.id.commerceDetails);

        mCommerceHeader.setText(getResources().getString(R.string.commerceHeader));
        mCommerceDetail.setText(getResources().getString(R.string.commerceDetail));
    }
}
