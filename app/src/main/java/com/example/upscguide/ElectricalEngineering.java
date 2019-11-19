package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ElectricalEngineering extends AppCompatActivity {

    private TextView mElectricalHeader;
    private TextView mElectricalDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical_engineering);

        mElectricalHeader=findViewById(R.id.electricalH);
        mElectricalDetail=findViewById(R.id.electricalDetails);

        mElectricalHeader.setText(getResources().getString(R.string.electricalHeader));
        mElectricalDetail.setText(getResources().getString(R.string.electricaldetail));
    }
}
