package com.example.a20uiyoparker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MyBooking_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_booking1);
        Button support = findViewById(R.id.support);

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyBooking_1.this, MyBooking_A.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.bookingNav);



        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override

                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                        switch (menuItem.getItemId()) {

                            case R.id.parkingNav:
                                Intent intent = new Intent(MyBooking_1.this, Home_A.class);
                                startActivity(intent);
                                overridePendingTransition(0, 0);
                                finish();
                                return true;
                            case R.id.bookingNav:

                                return true;
                            case R.id.walletsNav:
                                startActivity(new Intent(MyBooking_1.this, Wallets_A.class));
                                overridePendingTransition(0, 0);
                                finish();
                                return true;
                            case R.id.meNav:
                                startActivity(new Intent(MyBooking_1.this, Profile_A.class));
                                overridePendingTransition(0, 0);
                                finish();
                                return true;
                        }

                        return false;
                    }

                });
    }
}
