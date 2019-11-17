package com.example.upscguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Optional extends AppCompatActivity {

    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optional);

        listView= findViewById(R.id.Listview);
        String[] values =new String[]{"Agriculture","Animal Husbendry","Antropology"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(Optional.this,android.R.layout.activity_list_item, android.R.id.text1,values);
        listView.setAdapter(adapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
           @Override
           public void onItemClick(AdapterView<?> adapterView , View view , int position ,long arg3)
           {
               if(position==0){
                   Intent myIntent = new Intent(view.getContext(),Agriculture.class);
                   startActivityForResult(myIntent,0);
               }
               if(position==1){
                   Intent myIntent = new Intent(view.getContext(),AnimalHusbendry.class);
                   startActivityForResult(myIntent,1);
               }
               if(position==2){
                   Intent myIntent = new Intent(view.getContext(),Anthropology.class);
                   startActivityForResult(myIntent,2);
               }
           }
       });

    }
}
