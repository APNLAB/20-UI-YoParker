package com.example.a20uiyoparker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class List_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        Button map_btn;

        CardView cardView;

        cardView = findViewById(R.id.cardView);




        DrawerLayout drawerLayout;
        ImageView imageView;
        NavigationView navigationView;

        map_btn = findViewById(R.id.map_btn);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List_view.this, Details.class));
                finish();
            }
        });

        map_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List_view.this, Home_A.class));
                overridePendingTransition(0, 0);
                finish();
            }
        });

        drawerLayout = findViewById(R.id.drawerLayout);
        imageView = findViewById(R.id.imageMenu);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setItemIconTintList(null);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.parkingNav);

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override

                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                        switch (menuItem.getItemId()) {

                            case R.id.parkingNav:

                                return true;
                            case R.id.bookingNav:
                                Intent intent = new Intent(List_view.this, MyBooking_A.class);
                                startActivity(intent);
                                overridePendingTransition(0, 0);
                                finish();
                                return true;

                            case R.id.walletsNav:
                                startActivity(new Intent(List_view.this, Wallets_A.class));
                                overridePendingTransition(0, 0);
                                finish();
                                return true;
                            case R.id.meNav:
                                startActivity(new Intent(List_view.this, Profile_A.class));
                                overridePendingTransition(0, 0);
                                finish();
                                return true;
                        }

                        return false;
                    }

                });
    }
}