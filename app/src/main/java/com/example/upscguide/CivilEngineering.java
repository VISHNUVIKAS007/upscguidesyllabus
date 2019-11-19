package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CivilEngineering extends AppCompatActivity {

    private TextView mCivilHeader;
    private TextView mCivilDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_engineering);


        mCivilHeader=findViewById(R.id.civilH);
        mCivilDetail=findViewById(R.id.civilDetails);

        mCivilHeader.setText(getResources().getString(R.string.civilHeader));
        mCivilDetail.setText(getResources().getString(R.string.civilDetail));
    }
}
