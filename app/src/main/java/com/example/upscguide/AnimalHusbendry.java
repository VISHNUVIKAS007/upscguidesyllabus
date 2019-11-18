package com.example.upscguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnimalHusbendry extends AppCompatActivity {


    private TextView mAnimalHeader;
    private TextView mAnimalDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_husbendry);

        mAnimalHeader=findViewById(R.id.animalH);
        mAnimalDetail=findViewById(R.id.animalhusDetails);

        mAnimalHeader.setText(getResources().getString(R.string.animalHeader));
        mAnimalDetail.setText(getResources().getString(R.string.animalDetails));
    }
}
