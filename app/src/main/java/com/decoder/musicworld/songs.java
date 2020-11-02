package com.decoder.musicworld;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class songs extends AppCompatActivity {

    static MediaPlayer song1,song2,song3,song4,song5;

    static Boolean play = false,pause = true;

    ImageView onePlay,onePause,twoPlay,twoPause,threePlay,threePause,fourPlay,fourPause,fivePlay,fivePause;

    TextView songTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        song1 = MediaPlayer.create(this,R.raw.beliver);
        song2 = MediaPlayer.create(this,R.raw.hate_me);
        song3 = MediaPlayer.create(this,R.raw.propaganda);
        song4 = MediaPlayer.create(this,R.raw.senorita);
        song5 = MediaPlayer.create(this,R.raw.safari);

        songTitle = findViewById(R.id.title);

        onePlay =findViewById(R.id.one_play);
        onePause =findViewById(R.id.one_pause);
        twoPlay =findViewById(R.id.two_play);
        twoPause =findViewById(R.id.two_pause);
        threePlay =findViewById(R.id.three_play);
        threePause =findViewById(R.id.three_pause);
        fourPlay =findViewById(R.id.four_play);
        fourPause =findViewById(R.id.four_pause);
        fivePlay =findViewById(R.id.five_play);
        fivePause =findViewById(R.id.five_pause);

    }

    public void one(View view) {

        songTitle.setText("Believer");
        song2.pause();
        song3.pause();
        song4.pause();
        song5.pause();
        song(song1,onePlay,onePause);


    }

    public void two(View view) {

        songTitle.setText("Hate Me");
        song2.pause();
        song3.pause();
        song4.pause();
        song5.pause();
        song(song2,twoPlay,twoPause);

    }

    public void three(View view) {

        songTitle.setText("Propaganda");
        song2.pause();
        song3.pause();
        song4.pause();
        song5.pause();
        song(song3,threePlay,threePause);

    }

    public void four(View view) {

        songTitle.setText("Senorita");
        song2.pause();
        song3.pause();
        song4.pause();
        song5.pause();
        song(song4,fourPlay,fourPause);

    }

    public void five(View view) {

        songTitle.setText("Safari");
        song2.pause();
        song3.pause();
        song4.pause();
        song5.pause();
        song(song5,fivePlay,fivePause);

    }



    protected void song(MediaPlayer player,ImageView imgPlay,ImageView imgPause){

        if(play){
            player.pause();
            imgPlay.setAlpha(1f);
            imgPause.setAlpha(0f);

            pause = true;
        }

        else{
            player.start();
            imgPlay.setAlpha(0f);
            imgPause.setAlpha(1f);

            play = true;
        }

    }
}
