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
        String[] values =new String[]{"Agriculture","Animal Husbandry","Anthropology","Botany","Chemistry","Civil Engineering","Commerce","Economics","Electrical Engineering","English Literature","Geography","Geology",
        "History","Management","Mathematics","Mechanical Engineering","Medical Science","Law","Philosophy","Physics","Political Science","Psychology","Public Administration","Sociology","Statistics","Zoology"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(Optional.this,R.layout.row, R.id.headline
                ,values);
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
               if(position==3){
                   Intent myIntent = new Intent(view.getContext(),Botany.class);
                   startActivityForResult(myIntent,3);
               }
               if(position==4){
                   Intent myIntent = new Intent(view.getContext(),Chemistry.class);
                   startActivityForResult(myIntent,4);
               }
               if(position==5){
                   Intent myIntent = new Intent(view.getContext(),CivilEngineering.class);
                   startActivityForResult(myIntent,5);
               }
               if(position==6){
                   Intent myIntent = new Intent(view.getContext(),Commerce.class);
                   startActivityForResult(myIntent,6);
               }
               if(position==7){
                   Intent myIntent = new Intent(view.getContext(),Economics.class);
                   startActivityForResult(myIntent,7);
               }
               if(position==8){
                   Intent myIntent = new Intent(view.getContext(),ElectricalEngineering.class);
                   startActivityForResult(myIntent,8);
               }
               if(position==9){
                   Intent myIntent = new Intent(view.getContext(),English.class);
                   startActivityForResult(myIntent,9);
               }
               if(position==10){
                   Intent myIntent = new Intent(view.getContext(),Geography.class);
                   startActivityForResult(myIntent,10);
               }
               if(position==11){
                   Intent myIntent = new Intent(view.getContext(),Geology.class);
                   startActivityForResult(myIntent,11);
               }
               if(position==12){
                   Intent myIntent = new Intent(view.getContext(),History.class);
                   startActivityForResult(myIntent,12);
               }
               if(position==13){
                   Intent myIntent = new Intent(view.getContext(),Management.class);
                   startActivityForResult(myIntent,13);
               }
               if(position==14){
                   Intent myIntent = new Intent(view.getContext(),Mathamatics.class);
                   startActivityForResult(myIntent,14);
               }
               if(position==15){
                   Intent myIntent = new Intent(view.getContext(),MechanicalEngineering.class);
                   startActivityForResult(myIntent,15);
               }
               if(position==16){
                   Intent myIntent = new Intent(view.getContext(),MedicalScience.class);
                   startActivityForResult(myIntent,16);
               }
               if(position==17){
                   Intent myIntent = new Intent(view.getContext(),Law.class);
                   startActivityForResult(myIntent,17);
               }
               if(position==18){
                   Intent myIntent = new Intent(view.getContext(),Philosophy.class);
                   startActivityForResult(myIntent,18);
               }
               if(position==19){
                   Intent myIntent = new Intent(view.getContext(),Physics.class);
                   startActivityForResult(myIntent,19);
               }
               if(position==20){
                   Intent myIntent = new Intent(view.getContext(),PoliticalScience.class);
                   startActivityForResult(myIntent,20);
               }
               if(position==21){
                   Intent myIntent = new Intent(view.getContext(),Psycology.class);
                   startActivityForResult(myIntent,21);
               }
               if(position==22){
                   Intent myIntent = new Intent(view.getContext(),PublicAdmistration.class);
                   startActivityForResult(myIntent,22);
               }
               if(position==23){
                   Intent myIntent = new Intent(view.getContext(),Sociology.class);
                   startActivityForResult(myIntent,23);
               }
               if(position==24){
                   Intent myIntent = new Intent(view.getContext(),Statistics.class);
                   startActivityForResult(myIntent,24);
               }
               if(position==25){
                   Intent myIntent = new Intent(view.getContext(),Zoology.class);
                   startActivityForResult(myIntent,25);
               }

           }
       });

    }
}
