package com.example.upscguide;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;

    private Button mAbout;
    private  Button mPrilims;
    private  Button mMains;
    private  Button mOptional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        mAbout=findViewById(R.id.aboutTheExam);
        mPrilims=findViewById(R.id.prilims);
        mMains=findViewById(R.id.mains);
        mOptional=findViewById(R.id.optional);



        mAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });

        mPrilims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Prilims.class);
                startActivity(intent);
            }
        });

        mMains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Mains.class);
                startActivity(intent);
            }
        });

        mOptional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Optional.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.privacy:
                Intent intent = new Intent(this,PrivacyPolicy.class);
                startActivity(intent);
                return  true;
            case R.id.appAbout:
                Intent intent2 = new Intent(this,AppAbout.class);
                startActivity(intent2);
                return  true;
            /*case R.id.rateUs:
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id= "+getPackageName())));

                }catch(ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://play.google.com/store/apps/details?id="+getPackageName())));
                }
                return  true;*/
        }
        return super.onOptionsItemSelected(item);
    }
}
