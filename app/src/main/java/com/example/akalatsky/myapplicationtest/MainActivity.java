package com.example.akalatsky.myapplicationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Inject
    TestCL testCL;

    @BindView(R.id.textView) TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testCL = DaggerGameComponent.create().inject();

        textView.setText(testCL.name + "//" + testCL.name2 +  "//" + testCL.year);
        System.out.println("Test " + testCL.name + "//" + testCL.name2 +  "//" + testCL.year);

    }

    @OnClick(R.id.textView)
    void onTextClick() {
        textView.setText("POSLE CLIKA");
    }
}
