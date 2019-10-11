package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    //TextViews
    private TextView mainText;

    //Buttons
    private Button buttonMain;
    private Button buttonMain2;
    private Button buttonMain3;
    private Button buttonMain4;
    private Button resultsButton;

    //Counter
    private int surveyCounter;


    ArrayList<String> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mainText = findViewById(R.id.mainText);
        mainText.setText("What is your favorite meal of the day?");

        //Buttons
        buttonMain = findViewById(R.id.buttonMain);
        buttonMain2 = findViewById(R.id.buttonMain2);
        buttonMain3 = findViewById(R.id.buttonMain3);
        buttonMain4 = findViewById(R.id.buttonMain4);
        resultsButton = findViewById(R.id.resultsButton);

        //Counter initialization
        surveyCounter = 0;

        //List of answers in survey
        results = new ArrayList<>();
    }

    //Method to return 2nd Survey Questions
    public void secondQuestion(String previousInput){
        results.add(previousInput);
        mainText.setText("Are you following a particular diet?");
        buttonMain.setText("Vegan");
        buttonMain2.setText("Vegetarian");
        buttonMain3.setText("Gluten Free/Atkins");
        buttonMain4.setText("No diet in particular!");
    }

    public void thirdQuestion(String previousInput){
        results.add(previousInput);
        mainText.setText("When do you have your first meal?");
        buttonMain.setText("Morning (7-10am)");
        buttonMain2.setText("Early Afternon (11-2pm)");
        buttonMain3.setText("Evening (3-5pm)");
        buttonMain4.setText("No set time");

    }

    public void fourthQuestion(String previousInput){
        results.add(previousInput);
        mainText.setText("Are there any types of foods you prefer?");
        buttonMain.setText("American/Default");
        buttonMain2.setText("Mediterranean");
        buttonMain3.setText("Italian");
        buttonMain4.setText("Mexican");

    }

//    public void handleClick(View view) {
//        secondQuestion("Breakfast");
//    }

    public void handleClick2(View view) {
        //secondQuestion("Lunch");
//        Button button = (Button) view;
//        String buttonText = button.getText().toString();

        Button buttonMain = (Button) view;
        String buttonText = buttonMain.getText().toString();

        Log.i("does this work", surveyCounter + " ");

        if (view.getId() == buttonMain.getId()){
            surveyCounter++;
        }

        if (surveyCounter == 1) {
            // Add some code so that if it's question 2 you do this:
            secondQuestion(buttonText);
        }
        if (surveyCounter == 2) {
            thirdQuestion(buttonText);
        }
        if (surveyCounter == 3) {
            fourthQuestion(buttonText);
        }
        if (surveyCounter == 4) {
            results.add(buttonText);
        }

    }

    public void goToResults(View view){
        Log.i("results", results + " in goToResults method");
        Intent resultsIntent = new Intent(this, Results.class);
        resultsIntent.putStringArrayListExtra("Results", results);
        startActivity(resultsIntent);



        //resultsIntent.
    }
}
