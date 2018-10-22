package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TalkthattalkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti);

        ArrayList <Songtitle> talkthattalk= new ArrayList <Songtitle>();
        talkthattalk.add(new Songtitle("1\nYou da One\n","3:20 "));
        talkthattalk.add(new Songtitle ("2\nWhere Have You Been\n","4:03 "));
        talkthattalk.add(new Songtitle ("3\nWe Found Love\n","\n" + "3:36 "));
        talkthattalk.add(new Songtitle ("4\nTalk That Talk\n","3:30 "));
        talkthattalk.add(new Songtitle ("5\nCockiness (Love It)\n","2:58 "));
        talkthattalk.add(new Songtitle ("6\nBirthday Cake\n","1:18"));
        talkthattalk.add(new Songtitle ("7\nWe All Want Love\n","3:57 "));
        talkthattalk.add(new Songtitle ("8\nDrunk on Love\n","3:32 "));
        talkthattalk.add(new Songtitle ("9\nRoc Me Out\n","3:29 "));
        talkthattalk.add(new Songtitle("10\nWatch n' Learn\n","3:31 "));
        talkthattalk.add(new Songtitle ("11\nFarewell\n","4:16"));
        talkthattalk.add(new Songtitle("12\nRed Lipstick\n"," 3:43 "));
        talkthattalk.add(new Songtitle("13\nDo Ya Thang\n","3:43 "));
        talkthattalk.add(new Songtitle("14\nFool in Love\n"," 4:15 "));
        talkthattalk.add(new Songtitle("15\nWe Found Love (Calvin Harris extended mix)\n"," 5:45 "));

        SongtitleAdapter adapter = new SongtitleAdapter(this, talkthattalk);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}


