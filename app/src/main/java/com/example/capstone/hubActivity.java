package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;

import java.util.ArrayList;

public class hubActivity extends AppCompatActivity {

    ArrayList<String> res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);

        Intent intent = getIntent();
        res = intent.getStringArrayListExtra("Results");
        Log.i("results", res + " in Hub Activity");


    }

    public void goToResults(View view){
        Intent resultsIntent = new Intent(this, Results.class);
        resultsIntent.putStringArrayListExtra("Results", res);
        startActivity(resultsIntent);

        //resultsIntent.
    }

    public void goToRewards(View view) {
        Intent rewardsIntent = new Intent(this, RewardsActivity.class);
        startActivity(rewardsIntent);
    }
}
