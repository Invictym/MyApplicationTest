package com.example.akalatsky.myapplicationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    TestCL testCL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerGameComponent.create().inject(testCL);

        System.out.println(testCL);

    }
}
