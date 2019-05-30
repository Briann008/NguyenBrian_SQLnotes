package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    DataBaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d("MyContactApp", "MainActivity:    setting up the layout");
        setContentView(R.layout.activity_main);

        myDb = new DataBaseHelper(this);
        Log.d("MyContactApp", "MainActivity:    instantiate DataBaseHelper");
    }
}
