package com.example.theultimatenbaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstQuizActivity extends AppCompatActivity {
    private Button rightAnswerMavs;
    private Button wrongAnswerHeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_quiz);
        rightAnswerMavs = findViewById(R.id.dallasMavericks);
        wrongAnswerHeat = findViewById(R.id.miamiHeat);

        rightAnswerMavs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstQuizActivity.this, "Correct :)", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(FirstQuizActivity.this, SecondQuizActivity.class));
            }
        });
        wrongAnswerHeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstQuizActivity.this, "Wrong :(", Toast.LENGTH_SHORT).show();

            }
        });
    }
}

