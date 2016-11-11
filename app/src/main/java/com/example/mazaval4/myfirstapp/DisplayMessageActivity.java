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
 this should be browse but refactoring it causes errors so i thought id just leave it be
 this class shows the list of media available
 */
public class DisplayMessageActivity extends AppCompatActivity {

    ListView lvName;
    String [] name = {"Media1","Media2","Media3","Media4","Media5","Media6","Media7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        lvName = (ListView) findViewById(R.id.lv_Name);
        lvName.setAdapter(new ArrayAdapter<String>(DisplayMessageActivity.this,android.R.layout.simple_list_item_1,name
        ));
    }
}
