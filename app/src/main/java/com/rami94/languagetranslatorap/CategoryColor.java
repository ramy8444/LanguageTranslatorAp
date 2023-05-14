package com.rami94.languagetranslatorap;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import io.github.muddz.styleabletoast.StyleableToast;

public class CategoryColor extends AppCompatActivity {
    CardView cardViewColorBlue;
    CardView cardViewColorYellow;
    CardView cardViewColorRed;
    CardView cardViewColorGreen;
    CardView cardViewColorPink;
    CardView cardViewColorPurple;
    CardView cardViewColorBrown;
    CardView cardViewColorOrange;
    CardView cardViewColorGray;
    CardView cardViewColorWhite;
    CardView cardViewColorBlack;
    CardView cardViewColorBabyBlue;
    CardView cardViewColorNavyBlue;
    CardView cardViewColorTurquoise;
    CardView cardViewColorBeige;
    CardView cardViewColorBurgundy;
    CardView cardViewColorTeal;
    CardView cardViewColorCaramel;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_color);


        cardViewColorBlue = findViewById(R.id.id_card_blue);
        cardViewColorYellow = findViewById(R.id.id_card_color_yellow);
        cardViewColorRed = findViewById(R.id.id_card_red);
        cardViewColorGreen = findViewById(R.id.id_card_green);
        cardViewColorPink = findViewById(R.id.id_card_pink);
        cardViewColorPurple = findViewById(R.id.id_card_purple);
        cardViewColorBrown = findViewById(R.id.id_card_brown);
        cardViewColorOrange = findViewById(R.id.id_card_orange);
        cardViewColorGray = findViewById(R.id.id_card_gray);
        cardViewColorWhite = findViewById(R.id.id_card_White);
        cardViewColorBlack = findViewById(R.id.id_card_black);
        cardViewColorNavyBlue = findViewById(R.id.id_card_navyblue);
        cardViewColorTurquoise = findViewById(R.id.id_card_turqoeis);
        cardViewColorBeige = findViewById(R.id.beige);
        cardViewColorBurgundy = findViewById(R.id.id_card_burogwany);
        cardViewColorTeal = findViewById(R.id.id_card_teal);
        cardViewColorCaramel = findViewById(R.id.id_card_caramel);
        cardViewColorBabyBlue = findViewById(R.id.id_card_bapyblue);








        cardViewColorBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.blue);
                mediaPlayer.start();
                StyleableToast.makeText(CategoryColor.this,"ازرق",R.style.exampleToast).show();

            }
        });

        cardViewColorYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.);
               // mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"اصفر",R.style.exampleToast).show();

            }
        });

        cardViewColorRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.);
            //    mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"احمر",R.style.exampleToast).show();

            }
        });

        cardViewColorGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.green);
                mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"اخضر",R.style.exampleToast).show();
            }
        });

        cardViewColorPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           //     mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pink);
            //    mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"وردي",R.style.exampleToast).show();
            }
        });

        cardViewColorPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.purple);
             //   mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"بنفسجي",R.style.exampleToast).show();
            }
        });

        cardViewColorBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.brown);
                mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"بني",R.style.exampleToast).show();
            }
        });

        cardViewColorOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.orange);
                mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"برتقالي",R.style.exampleToast).show();
            }
        });

        cardViewColorGray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.gray);
             //   mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"رمادي",R.style.exampleToast).show();
            }
        });

        cardViewColorWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.white);
               // mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"ابيض",R.style.exampleToast).show();
            }
        });

        cardViewColorBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.black);
                mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"اسود",R.style.exampleToast).show();


            }
        });

        cardViewColorBabyBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.babyBlue);
                //mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"سماوي",R.style.exampleToast).show();
            }
        });

        cardViewColorNavyBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.navyBlue);
               // mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"كحلي",R.style.exampleToast).show();
            }
        });

        cardViewColorTurquoise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.turquoise);
                //mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"فيروزي",R.style.exampleToast).show();
            }
        });

        cardViewColorBeige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.beige);
              //  mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"بيج",R.style.exampleToast).show();
            }
        });

        cardViewColorBurgundy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.burgundy);
               // mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"ارجواني غامق",R.style.exampleToast).show();
            }
        });

        cardViewColorCaramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cramel);
               // mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"بني فاتح",R.style.exampleToast).show();
            }
        });

        cardViewColorTeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teal);
              //  mediaPlayer.start();

                StyleableToast.makeText(CategoryColor.this,"اخضر غامق",R.style.exampleToast).show();
            }
        });
    }
}