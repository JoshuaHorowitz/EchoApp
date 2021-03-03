package com.example.echoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText textToCopy;
    TextView copiedText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupFields();
        setButtonAction();
    }

    private void setupFields() {
        button = findViewById(R.id.button);
        textToCopy = findViewById(R.id.text_to_copy);
        copiedText = findViewById(R.id.copied_text);
    }

    private void setButtonAction()  {
        button.setOnClickListener(v -> copiedText.setText(textToCopy.getText().toString()));

    }

}