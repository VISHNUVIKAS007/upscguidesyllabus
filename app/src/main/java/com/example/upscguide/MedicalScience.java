package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MedicalScience extends AppCompatActivity {

    private TextView mmedicalHeader;
    private TextView mmedicalDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_science);


        mmedicalHeader=findViewById(R.id.medicalH);
        mmedicalDetail=findViewById(R.id.medicalDetails);

        mmedicalHeader.setText(getResources().getString(R.string.medicalHeader));
        mmedicalDetail.setText(getResources().getString(R.string.medicalDetails));
    }
}
