package com.example.dss.FirstOpenActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.dss.R;

public class Registration extends AppCompatActivity {

    ImageButton imageButtonSender;
    TextView mLogin;
    TextView mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        imageButtonSender = findViewById(R.id.firstOpenChecker);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_open);
        imageButtonSender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLogin = findViewById(R.id.loginer);
                mPassword = findViewById(R.id.passworder);
                Intent openNextActivity = new Intent(Registration.this, WhatToConnect.class);
                startActivity(openNextActivity);
            }
        });
    }

}