package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ToDoActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

        textView = findViewById(R.id.textView);

        textView.setText("1. Find better background images for Settings and main page \n " +
                "2. Finish food quiz then implement way to bypass to next quiz \n " +
                "3. Cite sources from images used \n " +
                "4. Implement internal clock into a page \n " +
                "5. Implement a personal user hub page to go to after finishing quizzes");
    }
}
