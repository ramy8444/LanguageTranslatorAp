package com.rami94.languagetranslatorap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CategoryChildren extends AppCompatActivity {

    CardView cardViewColors;
    CardView cardViewLetters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_children);
        cardViewColors = findViewById(R.id.id_card_colorss);
        cardViewLetters = findViewById(R.id.id_card_letters);

        cardViewColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryChildren.this, CategoryColor.class);
                startActivity(intent);
            }
        });

        cardViewLetters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryChildren.this, CategoryLetters.class);
                startActivity(intent);
            }
        });

    }
}