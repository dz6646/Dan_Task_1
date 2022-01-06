package com.example.dan_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button updateClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateClick = findViewById(R.id.clickButton);
    }

    public void updateClick(View view) {
        updateClick.setText("Oh, yea, i've been clicked!");
    }
}