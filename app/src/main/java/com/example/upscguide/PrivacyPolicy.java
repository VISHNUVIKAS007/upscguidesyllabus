package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PrivacyPolicy extends AppCompatActivity {
    private TextView mPrivacy;
    private TextView mPrivacyD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        mPrivacy=findViewById(R.id.privacyHeaderScreen);
        mPrivacyD=findViewById(R.id.privacyDetails);

        mPrivacy.setText(getResources().getString(R.string.privacy));
        mPrivacyD.setText(getResources().getString(R.string.privacyDetails));

    }
}
