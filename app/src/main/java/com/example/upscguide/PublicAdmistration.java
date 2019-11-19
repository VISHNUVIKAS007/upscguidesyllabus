package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PublicAdmistration extends AppCompatActivity {
    private TextView mpublicHeader;
    private TextView mpublicDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_admistration);

        mpublicHeader=findViewById(R.id.publicH);
        mpublicDetail=findViewById(R.id.publicDetails);

        mpublicHeader.setText(getResources().getString(R.string.publicHeader));
        mpublicDetail.setText(getResources().getString(R.string.publicDetails));
    }
}
