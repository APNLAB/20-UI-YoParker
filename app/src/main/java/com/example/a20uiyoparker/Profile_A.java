package com.example.a20uiyoparker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile_A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_a);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        ImageButton editBtn = findViewById(R.id.editBtn);

        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile_A.this, EditProfile.class));
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.meNav);

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override

                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                        switch (menuItem.getItemId()) {

                            case R.id.parkingNav:
                                startActivity(new Intent(Profile_A.this, Home_A.class));
                                overridePendingTransition(0, 0);
                                finish();
                                return true;
                            case R.id.bookingNav:
                                Intent intent = new Intent(Profile_A.this, MyBooking_A.class);
                                startActivity(intent);
                                overridePendingTransition(0, 0);
                                finish();
                                return true;

                            case R.id.walletsNav:
                                startActivity(new Intent(Profile_A.this, Wallets_A.class));
                                overridePendingTransition(0, 0);
                                finish();
                                return true;
                            case R.id.meNav:

                                return true;
                        }

                        return false;
                    }

                });
    }
}