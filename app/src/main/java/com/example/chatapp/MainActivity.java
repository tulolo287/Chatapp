package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail, etPassword;
    Button signin;
    TextView loginInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.nameET);
        etEmail = findViewById(R.id.emailET);
        etPassword = findViewById(R.id.passwordET);

        signin = findViewById(R.id.signinBt);
        loginInfo = findViewById(R.id.loginInfoTV);
    }
}