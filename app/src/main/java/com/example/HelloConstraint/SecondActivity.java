package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_NUMBER);
        TextView textNumber = findViewById(R.id.number);
        textNumber.setText(message);
    }
}