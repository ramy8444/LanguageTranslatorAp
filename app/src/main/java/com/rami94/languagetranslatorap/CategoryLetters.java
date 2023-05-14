package com.rami94.languagetranslatorap;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CategoryLetters extends AppCompatActivity {

    CardView cardViewLetterA;
    CardView cardViewLetterB;
    CardView cardViewLetterC;
    CardView cardViewLetterD;
    CardView cardViewLetterE;
    CardView cardViewLetterF;
    CardView cardViewLetterG;
    CardView cardViewLetterH;
    CardView cardViewLetterI;
    CardView cardViewLetterJ;
    CardView cardViewLetterK;
    CardView cardViewLetterL;
    CardView cardViewLetterM;
    CardView cardViewLetterN;
    CardView cardViewLetterO;
    CardView cardViewLetterP;
    CardView cardViewLetterQ;
    CardView cardViewLetterR;
    CardView cardViewLetterS;
    CardView cardViewLetterT;
    CardView cardViewLetterU;
    CardView cardViewLetterV;
    CardView cardViewLetterW;
    CardView cardViewLetterX;
    CardView cardViewLetterY;
    CardView cardViewLetterZ;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_letters);

        cardViewLetterA = findViewById(R.id.id_a);
        cardViewLetterB = findViewById(R.id.id_b);
        cardViewLetterC = findViewById(R.id.id_c);
        cardViewLetterD = findViewById(R.id.id_d);
        cardViewLetterE = findViewById(R.id.id_e);
        cardViewLetterF = findViewById(R.id.id_f);
        cardViewLetterG = findViewById(R.id.id_g);
        cardViewLetterH = findViewById(R.id.id_h);
        cardViewLetterI = findViewById(R.id.id_i);
        cardViewLetterJ = findViewById(R.id.id_j);
        cardViewLetterK = findViewById(R.id.id_k);
        cardViewLetterL = findViewById(R.id.id_l);
        cardViewLetterM = findViewById(R.id.id_m);
        cardViewLetterN = findViewById(R.id.id_n);
        cardViewLetterO = findViewById(R.id.id_o);
        cardViewLetterP = findViewById(R.id.id_p);
        cardViewLetterQ = findViewById(R.id.id_q);
        cardViewLetterR = findViewById(R.id.id_r);
        cardViewLetterS = findViewById(R.id.id_s);
        cardViewLetterT = findViewById(R.id.id_t);
        cardViewLetterU = findViewById(R.id.id_u);
        cardViewLetterV = findViewById(R.id.id_v);
        cardViewLetterW = findViewById(R.id.id_w);
        cardViewLetterX = findViewById(R.id.id_x);
        cardViewLetterY = findViewById(R.id.id_y);
        cardViewLetterZ = findViewById(R.id.id_z);


        cardViewLetterA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.a);

                mediaPlayer.start();


            }
        });
        cardViewLetterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.b);
                mediaPlayer.start();

            }
        });
        cardViewLetterC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.c);
                mediaPlayer.start();

            }
        });
        cardViewLetterD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.d);
                mediaPlayer.start();
            }
        });
        cardViewLetterE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.e);
                mediaPlayer.start();

            }
        });
        cardViewLetterF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.f);
                mediaPlayer.start();

            }
        });
        cardViewLetterG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.g);
                mediaPlayer.start();
            }
        });
        cardViewLetterH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.h);
                mediaPlayer.start();

            }
        });
        cardViewLetterI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.i);
                mediaPlayer.start();

            }
        });
        cardViewLetterJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.j);
                mediaPlayer.start();
            }
        });
        cardViewLetterK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.k);
                mediaPlayer.start();

            }
        });
        cardViewLetterL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.l);
                mediaPlayer.start();

            }
        });
        cardViewLetterM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.m);
                mediaPlayer.start();
            }
        });
        cardViewLetterN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.n);
                mediaPlayer.start();

            }
        });
        cardViewLetterO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.o);
                mediaPlayer.start();

            }
        });
        cardViewLetterP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.p);
                mediaPlayer.start();
            }
        });
        cardViewLetterQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.q);
                mediaPlayer.start();

            }
        });
        cardViewLetterR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.r);
                mediaPlayer.start();

            }
        });
        cardViewLetterS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.s);
                mediaPlayer.start();
            }
        });
        cardViewLetterT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.t);
                mediaPlayer.start();

            }
        });
        cardViewLetterU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.u);
                mediaPlayer.start();

            }
        });
        cardViewLetterV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v);
                mediaPlayer.start();
            }
        });
        cardViewLetterW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.w);
                mediaPlayer.start();

            }
        });
        cardViewLetterX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.x);
                mediaPlayer.start();

            }
        });
        cardViewLetterY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.y);
                mediaPlayer.start();

            }
        });
        cardViewLetterZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.z);
                mediaPlayer.start();

            }
        });


    }
}