package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class UnapologeticActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti);

        ArrayList <Songtitle> unapologetic= new ArrayList <Songtitle>();
        unapologetic.add(new Songtitle("1\nPhresh Out the Runway\n","3:42 "));
        unapologetic.add(new Songtitle("2\nDiamonds\n","3:45 "));
        unapologetic.add(new Songtitle("3\nNumb\n","3:25 "));
        unapologetic.add(new Songtitle("4\nPour It Up [Explicit]\n","2:41 "));
        unapologetic.add(new Songtitle("5\nLoveeeeeee Song\n","4:16 "));
        unapologetic.add(new Songtitle("6\nJump [Explicit]\n","4:24"));
        unapologetic.add(new Songtitle("7\nRight Now\n","3:01 "));
        unapologetic.add(new Songtitle("8\nWhat Now\n","4:03 "));
        unapologetic.add(new Songtitle("9\nStay" + "\n"," 4:00 "));
        unapologetic.add(new Songtitle("10\nNobody's Business\n","3:36 "));
        unapologetic.add(new Songtitle("11\nLove Without Tragedy / Mother Mary\n","6:58 "));
        unapologetic.add(new Songtitle("12\nGet It Over With\n"," 3:31 "));
        unapologetic.add(new Songtitle("13\nNo Love Allowed\n","  4:09 "));
        unapologetic.add(new Songtitle("14\nLost in Paradise\n","  3:35 "));

        SongtitleAdapter adapter = new SongtitleAdapter(this, unapologetic);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

