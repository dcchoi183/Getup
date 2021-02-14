package com.example.getup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createNew(View v){

    Log.d(tag:"success", msg="New alarm added!");
    Button button = (Button) v;

    }

    public void toggleAlarm(){


        
    }
}