package com.decoder.musicworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class micheal_jackson extends AppCompatActivity {

    Boolean one,two,three,four,five,six,seven;
    static String ONE = "com.decoder.musicworld.one";
    static String TWO = "com.decoder.musicworld.two";
    static String THREE = "com.decoder.musicworld.three";
    static String FOUR = "com.decoder.musicworld.four";
    static String FIVE = "com.decoder.musicworld.five";
    static String SIX = "com.decoder.musicworld.six";
    static String SEVEN = "com.decoder.musicworld.seven";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_micheal_jackson);
    }

    public void one(View view) {
        Intent intent = new Intent(this,micheal_song.class);
        one = true;
        intent.putExtra(ONE,one);
        startActivity(intent);
    }

    public void two(View view) {
        Intent intent = new Intent(this,micheal_song.class);
        two = true;
        intent.putExtra(TWO,two);
        startActivity(intent);
    }

    public void three(View view) {
        Intent intent = new Intent(this,micheal_song.class);
        three = true;
        intent.putExtra(THREE,three);
        startActivity(intent);
    }

    public void four(View view) {
        Intent intent = new Intent(this,micheal_song.class);
        four = true;
        intent.putExtra(FOUR,four);
        startActivity(intent);
    }

    public void five(View view) {
        Intent intent = new Intent(this,micheal_song.class);
        five = true;
        intent.putExtra(FIVE,five);
        startActivity(intent);
    }

    public void six(View view) {
        Intent intent = new Intent(this,micheal_song.class);
        six = true;
        intent.putExtra(SIX,six);
        startActivity(intent);
    }

    public void seven(View view) {
        Intent intent = new Intent(this,micheal_song.class);
        seven = true;
        intent.putExtra(SEVEN,seven);
        startActivity(intent);
    }
}
