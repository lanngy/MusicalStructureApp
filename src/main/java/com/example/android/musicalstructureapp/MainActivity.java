package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        ImageView anti = (ImageView) findViewById(R.id.anti);

        anti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent antiint = new Intent(MainActivity.this, AntiActivity.class);

                startActivity(antiint);

            }
        });

        ImageView unapologetic = (ImageView) findViewById(R.id.unapologetic);

        unapologetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent unapologeticint = new Intent(MainActivity.this, UnapologeticActivity.class);

                startActivity(unapologeticint);

            }
        });

        ImageView loud = (ImageView) findViewById(R.id.loud);

        loud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent loudint = new Intent(MainActivity.this, LoudActivity.class);

                startActivity(loudint);

            }
        });

        ImageView talkthattalk = (ImageView) findViewById(R.id.talkthattalk);

        talkthattalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent talkthattalkint = new Intent(MainActivity.this, TalkthattalkActivity.class);

                startActivity(talkthattalkint);

            }
        });


    }
}
