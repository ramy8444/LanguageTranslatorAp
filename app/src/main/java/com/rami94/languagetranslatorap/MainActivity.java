package com.rami94.languagetranslatorap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView cardViewTranslate;
    CardView cardViewForPeople;
    CardView cardViewChildren;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardViewTranslate = findViewById(R.id.idCardTranslater);
        cardViewForPeople = findViewById(R.id.idCardForPeople);
        cardViewChildren = findViewById(R.id.idCardChildren);

        cardViewTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TranslatePage.class);
                startActivity(intent);
            }
        });

        cardViewChildren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CategoryChildren.class);
                startActivity(intent);
            }
        });
    }

}