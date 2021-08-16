package com.example.a20uiyoparker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Locations extends AppCompatActivity {

    Button currentLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

//        currentLoc = findViewById(R.id.currentLoc);
//
//        currentLoc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Locations.this, Phone.class);
//                startActivity(intent);
//            }
//        });
    }
}