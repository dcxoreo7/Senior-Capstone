package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class Results extends AppCompatActivity {

    //TextViews
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent resultsIntent = getIntent();
        ArrayList<String> results = resultsIntent.getStringArrayListExtra("Results");
        //resultsIntent.getStringArrayExtra("results");
        Log.i("results", results + " in onCreate method");

        textView = findViewById(R.id.mainText);
        textView.setText("Results go here!" + results);
    }
}
