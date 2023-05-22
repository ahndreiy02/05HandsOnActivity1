package com.example.handsonactivity1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultTextView = findViewById(R.id.resultTextView);
        String text1 = getIntent().getStringExtra("text1");
        String text2 = getIntent().getStringExtra("text2");

        if (text1.equals(text2)) {
            resultTextView.setText("SAME");
        } else {
            resultTextView.setText("NOT THE SAME");
        }
    }
}
