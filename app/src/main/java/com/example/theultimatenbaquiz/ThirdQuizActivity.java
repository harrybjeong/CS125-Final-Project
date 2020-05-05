package com.example.theultimatenbaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdQuizActivity extends AppCompatActivity {
    private Button rightAnswerJerry;
    private Button wrongAnswerBill;
    private Button wrongAnswerGary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_quiz);

        rightAnswerJerry = findViewById(R.id.jerryWest);
        wrongAnswerBill = findViewById(R.id.billRussell);
        wrongAnswerGary = findViewById(R.id.garyPayton);

        rightAnswerJerry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdQuizActivity.this, "Correct :)", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ThirdQuizActivity.this, FinalActivity.class));
            }
        });

        wrongAnswerBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdQuizActivity.this, "Wrong :(", Toast.LENGTH_SHORT).show();
            }
        });

        wrongAnswerGary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdQuizActivity.this, "Wrong :(", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
