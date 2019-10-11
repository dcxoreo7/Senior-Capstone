package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //TextViews
    private TextView welcomeMessage;
    private TextView mainText;

    //Buttons
    private Button startButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextViews
        welcomeMessage = findViewById(R.id.welcomeMessage);
        mainText = findViewById(R.id.mainText);


        startButton = findViewById(R.id.startButton);
    }

    public void goToQuiz(View view){
        Intent quizIntent = new Intent(this, QuizActivity.class);
        startActivity(quizIntent);

    }

    public void goToSettings(View view) {
        Intent settingsIntent = new Intent(this, SettingsActivity.class);
        startActivity(settingsIntent);
    }
}
