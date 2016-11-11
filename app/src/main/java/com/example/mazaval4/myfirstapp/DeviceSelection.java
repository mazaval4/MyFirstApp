package com.example.mazaval4.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.app.Activity;


/*
This class is the table rows of devices that are to be selected.
 */
public class DeviceSelection extends AppCompatActivity {

    ListView lvName;
    String [] name = {"Device1","Device2","Device3","Device4","Device5","Device6","Device7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        lvName = (ListView) findViewById(R.id.lv_Name);
        lvName.setAdapter(new ArrayAdapter<String>(DeviceSelection.this,android.R.layout.simple_list_item_1,name
        ));
    }
}
