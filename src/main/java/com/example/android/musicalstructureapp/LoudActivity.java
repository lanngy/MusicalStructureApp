package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LoudActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti);

        ArrayList <Songtitle> loud= new ArrayList <Songtitle>();
        loud.add(new Songtitle("1\nS&M\n","4:03 "));
        loud.add(new Songtitle ("2\nWhat's My Name?\n","4:23 "));
        loud.add(new Songtitle ("3\nCheers (Drink to That)\n","4:22 "));
        loud.add(new Songtitle ("4\nFading\n","3:20 "));
        loud.add(new Songtitle ("5\nOnly Girl (In the World)\n","3:55 "));
        loud.add(new Songtitle ("6\nCalifornia King Bed\n","4:12"));
        loud.add(new Songtitle ("7\nMan Down\n","4:27 "));
        loud.add(new Songtitle ("8\nRaining Men\n","2:13 "));
        loud.add(new Songtitle ("9\nComplicated\n","4:18 "));
        loud.add(new Songtitle("10\nSkin\n","5:04 "));
        loud.add(new Songtitle ("11\nLove the Way You Lie (Part II)\n","4:56 "));

        SongtitleAdapter adapter = new SongtitleAdapter(this, loud);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

