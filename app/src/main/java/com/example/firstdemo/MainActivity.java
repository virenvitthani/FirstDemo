package com.example.firstdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Activity Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Activity Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Activity Destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Activity Pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Activity Restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Activity Resume");
    }
}