package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String FILE_NAME = "example.txt";

    FileInputStream fis;

    ArrayList<String> res;

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

    public void goToQuiz(View view) {


        Log.i("Test", "Something ");
        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text = br.readLine();

            //sb.append(text).append("\n");



            if (text != null) {
                Log.i("Test", text + " Second time");
                Intent hubIntent = new Intent(this, hubActivity.class);
                startActivity(hubIntent);

            }

            if (text == null || text.isEmpty()) {
                Intent quizIntent = new Intent(this, QuizActivity.class);
                startActivity(quizIntent);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void goToSettings(View view) {
        Intent settingsIntent = new Intent(this, SettingsActivity.class);
        startActivity(settingsIntent);
    }

    public void goToResults(View view){
        Intent resultsIntent = new Intent(this, Results.class);
        resultsIntent.putStringArrayListExtra("Results", res);
        startActivity(resultsIntent);

        //resultsIntent.
    }
}
