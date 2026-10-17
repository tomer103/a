package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textView4;
    private Button button1;
    private TextView textViewCounter;
    private Button buttonClick;
    private Button buttonReset;
    private int clickCount = 0;
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;
    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mission 1 – reveal hidden text only
        textView4 = findViewById(R.id.textView4);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView4.setVisibility(View.VISIBLE);
            }
        });

        // Mission 2 – counter + reset
        textViewCounter = findViewById(R.id.textViewCounter);
        buttonClick = findViewById(R.id.buttonClick);
        buttonReset = findViewById(R.id.buttonReset);

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                textViewCounter.setText("מספר הלחיצות: " + clickCount);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount = 0;
                textViewCounter.setText("מספר הלחיצות: 0");
            }
        });


        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewMessage = findViewById(R.id.textViewMessage);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();
                if (username.isEmpty() || password.isEmpty()) {
                    textViewMessage.setText("אנא מלא את כל השדות");
                } else {
                    textViewMessage.setText("שלום " + username + ", התחברת בהצלחה!");
                }
            }
        });
    }
}