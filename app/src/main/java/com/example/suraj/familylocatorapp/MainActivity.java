package com.example.suraj.familylocatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GlobalInfo globalInfo = new GlobalInfo(this);
        globalInfo.LoadData();


    }
}
