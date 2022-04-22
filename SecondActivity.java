package com.example.hwactivity;

import static java.lang.Integer.valueOf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        String str = getIntent().getStringExtra("smth");
//        getSupportActionBar().setTitle(str);

        String data = getIntent().getExtras().getString("testNameData");
        getSupportActionBar().setTitle(data);


    }

    public void Mew(View view) {

        setContentView(R.layout.activity_main);
        String str = getIntent().getStringExtra("testNameData");
        int strInt = valueOf(str);
        strInt++;
        str = String.valueOf(strInt);
        getSupportActionBar().setTitle(str);

    }
}