package com.example.a20uiyoparker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import org.jetbrains.annotations.NotNull;

public class MyBooking_A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_booking_a);

        Button support = findViewById(R.id.support);

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyBooking_A.this, MyBooking_A.class);
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
                                Intent intent = new Intent(MyBooking_A.this, Home_A.class);
                                startActivity(intent);
                                overridePendingTransition(0, 0);
                                finish();
                                return true;
                            case R.id.bookingNav:

                                return true;
                            case R.id.walletsNav:
                                startActivity(new Intent(MyBooking_A.this, Wallets_A.class));
                                overridePendingTransition(0, 0);
                                finish();
                                return true;
                            case R.id.meNav:
                                startActivity(new Intent(MyBooking_A.this, Profile_A.class));
                                overridePendingTransition(0, 0);
                                finish();
                                return true;
                        }

                        return false;
                    }

                });
    }
}


