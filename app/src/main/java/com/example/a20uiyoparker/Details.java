package com.example.a20uiyoparker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        Dialog dialog;

        dialog = new Dialog(Details.this);

        Button overView= findViewById(R.id.overView);
        Button start= findViewById(R.id.start);
        CardView timePickerCard = findViewById(R.id.timePickerCard);

        dialog.setContentView(R.layout.time_picker_popup);

        Button cancelBtn = dialog.findViewById(R.id.cancelBtn);

//        cancelBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Details.this, Splash.class));
//                //dialog.dismiss();
//            }
//        });

        overView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Details.this, Overview.class));
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Details.this, Start.class));
            }
        });



        timePickerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.time_picker_popup);
                
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                dialog.show();



            }
        });




    }
}

