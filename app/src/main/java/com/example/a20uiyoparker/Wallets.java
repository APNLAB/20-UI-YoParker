package com.example.a20uiyoparker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Wallets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wallets);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.walletsNav);

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override

                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                        switch (menuItem.getItemId()) {

                            case R.id.parkingNav:
                                startActivity(new Intent(Wallets.this, Home_A.class));
                                overridePendingTransition(0, 0);
                                finish();
                                return true;
                            case R.id.bookingNav:
                                Intent intent = new Intent(Wallets.this, MyBooking_A.class);
                                startActivity(intent);
                                overridePendingTransition(0, 0);
                                finish();
                                return true;

                            case R.id.walletsNav:

                                return true;
                            case R.id.meNav:
                                startActivity(new Intent(Wallets.this, Profile_A.class));
                                overridePendingTransition(0, 0);
                                finish();
                                return true;
                        }

                        return false;
                    }

                });
    }
}