package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MechanicalEngineering extends AppCompatActivity {
    private TextView mmechanicalHeader;
    private TextView mmechanicalDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical_engineering);


        mmechanicalHeader=findViewById(R.id.mechanicalH);
        mmechanicalDetail=findViewById(R.id.mechanicalDetails);

        mmechanicalHeader.setText(getResources().getString(R.string.mechanicalHeader));
        mmechanicalDetail.setText(getResources().getString(R.string.mechanicalDetails));
    }
}
