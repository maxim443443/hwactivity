package com.example.hwactivity;

import static java.lang.Integer.valueOf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void fun(View view) {

//        Intent intent = new Intent(this, SecondActivity.class);
//        Cat cat = new Cat();
//        cat.name = "Cho-cho";
//        cat.year = 2;
//        intent.putExtra("smth", cat.name + " " + cat.year + "");
//        this.startActivity(intent);

        String data ="1";
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra("testNameData", data);
        startActivity(i);
        count++;
    }
}