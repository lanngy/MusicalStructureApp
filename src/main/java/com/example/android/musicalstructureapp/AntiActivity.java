package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AntiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti);

        ArrayList <Songtitle> anti= new ArrayList <Songtitle>();
        anti.add(new Songtitle("1\nConsideration\n","2:41 "));
        anti.add(new Songtitle ("2\nJames Joint\n","1:12 "));
        anti.add(new Songtitle ("3\nKiss it better\n","4:13 "));
        anti.add(new Songtitle ("4\nWork\n","3:39 "));
        anti.add(new Songtitle ("5\nDesperado\n","3:06 "));
        anti.add(new Songtitle ("6\nWoo\n","3:55"));
        anti.add(new Songtitle ("7\nNeeded Me\n","3:11 "));
        anti.add(new Songtitle ("8\nYeah, I said it\n","2:13 "));
        anti.add(new Songtitle ("9\nSame Ol’ Mistakes\n","6:37 "));
        anti.add(new Songtitle("10\nNever Ending\n","3:22 "));
        anti.add(new Songtitle("11\nLove on the Brain\n","3:44 "));
        anti.add(new Songtitle("12\nHigher\n"," 2:00 "));
        anti.add(new Songtitle("13\nClose to You\n"," 3:43 "));

        SongtitleAdapter adapter = new SongtitleAdapter(this, anti);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}



