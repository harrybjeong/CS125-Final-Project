package com.example.theultimatenbaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondQuizActivity extends AppCompatActivity {
    private Button rightAnswerStephen;
    private Button wrongAnswerMichael;
    private Button wrongAnswerKobe;
    private Button wrongAnswerLebron;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_quiz);

        rightAnswerStephen = findViewById(R.id.stephenCurry);
        wrongAnswerMichael = findViewById(R.id.michaelJordan);
        wrongAnswerKobe = findViewById(R.id.kobeBryant);
        wrongAnswerLebron = findViewById(R.id.lebronJames);

        rightAnswerStephen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondQuizActivity.this, "Correct :)", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SecondQuizActivity.this, ThirdQuizActivity.class));
            }
        });

        wrongAnswerMichael.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondQuizActivity.this, "Wrong :(", Toast.LENGTH_SHORT).show();
            }
        });

        wrongAnswerKobe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondQuizActivity.this, "Wrong :(", Toast.LENGTH_SHORT).show();
            }
        });

        wrongAnswerLebron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondQuizActivity.this, "Wrong :(", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
