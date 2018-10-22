package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lan on 15.05.2018.
 */
public class SongtitleAdapter extends ArrayAdapter<Songtitle> {

    public SongtitleAdapter(Activity context, ArrayList<Songtitle> androidSongs) {
        super(context,0,androidSongs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View list = convertView;
        if(list==null) {
            list = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        Songtitle currentSong = getItem(position);
        TextView titlename = (TextView) list.findViewById(R.id.title);
        titlename.setText(currentSong.getMtitle());

        TextView timename = (TextView) list.findViewById(R.id.time);
        timename.setText(currentSong.getMtime());

        return list;
    }
}