package com.example.dss;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dss.FirstOpenActivities.Registration;

public class MainActivity extends AppCompatActivity {

    ImageButton sender = new ImageButton();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Intent openFirstOpenActivity = new Intent (MainActivity.this, Registration.class);
        startActivity(openFirstOpenActivity);

        sender= findViewById(R.id.send);
        sender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //... nobody knows
            }
        });
        sender.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
                
            }
        });
        /*SharedPreferences sp = new PreferenceManager.getDefaultSharedPreferences(this);

        boolean isAgain = sp.getBoolean("isAgain", false);

        if (!isAgain){
            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("isAgain", true);
            e.apply();
            Intent openFirstOpenActivity = new Intent (MainActivity.this, Registration.class);
            startActivity(openFirstOpenActivity);
        }*/
    }
}