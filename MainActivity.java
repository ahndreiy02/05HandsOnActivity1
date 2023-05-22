package com.example.handsonactivity1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText textField1, textField2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textField1 = findViewById(R.id.textField1);
        textField2 = findViewById(R.id.textField2);

        Button swapButton = findViewById(R.id.swapButton);
        swapButton.setOnClickListener(v -> swapTextFields());

        Button compareButton = findViewById(R.id.compareButton);
        compareButton.setOnClickListener(v -> compareTextFields());
    }

    private void swapTextFields() {
        String temp = textField1.getText().toString();
        textField1.setText(textField2.getText().toString());
        textField2.setText(temp);
    }

    private void compareTextFields() {
        String text1 = textField1.getText().toString();
        String text2 = textField2.getText().toString();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("text1", text1);
        intent.putExtra("text2", text2);
        startActivity(intent);
    }
}
