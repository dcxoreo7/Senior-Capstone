package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class hubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);
    }


    public void goToResults(View view){
        Intent resultsIntent = new Intent(this, Results.class);
        startActivity(resultsIntent);



        //resultsIntent.
    }
}
