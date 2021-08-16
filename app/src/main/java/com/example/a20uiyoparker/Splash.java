package com.example.a20uiyoparker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    ImageView splashScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        splashScreen = findViewById(R.id.splashScreen);

        splashScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Splash.this, Locations.class);
                startActivity(intent);
            }
        });
    }
}