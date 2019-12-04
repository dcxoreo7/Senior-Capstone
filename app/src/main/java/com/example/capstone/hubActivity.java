package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;

import java.util.ArrayList;

public class hubActivity extends AppCompatActivity {

    //Recycle view components
    private RecyclerView myRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    //List that references quiz answers
    ArrayList<String> res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);

        myRecyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        myRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(layoutManager);

        // specify an adapter
//        mAdapter = new MyAdapter(myDataset);
//        myRecyclerView.setAdapter(mAdapter);

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
