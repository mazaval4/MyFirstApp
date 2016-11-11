package com.example.mazaval4.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

/*this class is the two buttons: bluetooth and devices
the user chooses which one they want
From here they go to device list.
 */
public class Sources extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sources);
    }

    public void displayDevices(View view) {
        Intent intent = new Intent(this, DeviceSelection.class);
        startActivity(intent);
    }



}
