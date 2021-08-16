 package com.example.a20uiyoparker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class Verification extends AppCompatActivity {

     Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        btn = findViewById(R.id.btn);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Verification.this, Success.class);
//                startActivity(intent);
//            }
//        });
    }
}