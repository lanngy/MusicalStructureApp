package com.example.android.musicalstructureapp;

/**
 * Created by Lan on 13.05.2018.
 */


public class Songtitle {
    private String mtitle;
    private String mtime;

    public Songtitle (String title, String time) {
        mtitle=title;
        mtime=time;
    }
    public String getMtitle() {
        return mtitle;
    }
    public String getMtime()  {
        return mtime;
    }

    public static class WordAdapter {
    }
}
