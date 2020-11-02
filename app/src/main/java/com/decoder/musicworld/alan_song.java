package com.decoder.musicworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class alan_song extends AppCompatActivity {

    static MediaPlayer song1,song2,song3,song4,song5,song6,song7;

    static Boolean song_one = false ,song_two = false,song_three = false,song_four = false,song_five = false,song_six = false,song_seven = false;

    static int song,totalTime;

    static Boolean play,pause;

    ImageView imgPlay,imgPause;

    TextView songTitle,elapsedTimeLabel,remainingTimeLabel;

    SeekBar positionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alan_song);

        Intent intent = getIntent();

        song_one =  intent.getBooleanExtra(justin.ONE,false);
        song_two = intent.getBooleanExtra(justin.TWO,false);
        song_three = intent.getBooleanExtra(justin.THREE,false);
        song_four = intent.getBooleanExtra(justin.FOUR,false);
        song_five = intent.getBooleanExtra(justin.FIVE,false);
        song_six = intent.getBooleanExtra(justin.SIX,false);
        song_seven = intent.getBooleanExtra(justin.SEVEN,false);


        song1 = MediaPlayer.create(this,R.raw.faded);
        song2 = MediaPlayer.create(this,R.raw.onmyway);
        song3 = MediaPlayer.create(this,R.raw.are_you_lonely);
        song4 = MediaPlayer.create(this,R.raw.do_it);
        song5 = MediaPlayer.create(this,R.raw.i_dont_wanna);
        song6 = MediaPlayer.create(this,R.raw.all_falls_down);
        song7 = MediaPlayer.create(this,R.raw.dark_side);

        imgPlay = findViewById(R.id.play);
        imgPause = findViewById(R.id.pause);


        songTitle = findViewById(R.id.song);
        elapsedTimeLabel = findViewById(R.id.elaptime);
        remainingTimeLabel = findViewById(R.id.remtime);

        positionBar = findViewById(R.id.seekBar);

        song();
    }

    public void previous(View view) {

        if(song == 1){
            song1.pause();
            song2.pause();
            song3.pause();
            song4.pause();
            song5.pause();
            song6.pause();
            song7.start();

            song =7;

            title();

            seekBar(song7);
        }

        else if(song == 2){

            song1.start();
            song2.pause();
            song3.pause();
            song4.pause();
            song5.pause();
            song6.pause();
            song7.pause();

            song = 1;

            title();

            seekBar(song1);
        }

        else if(song == 3){

            song1.pause();
            song2.start();
            song3.pause();
            song4.pause();
            song5.pause();
            song6.pause();
            song7.pause();

            song = 2;

            title();

            seekBar(song2);
        }

        else if(song == 4){

            song1.pause();
            song2.pause();
            song3.start();
            song4.pause();
            song5.pause();
            song6.pause();
            song7.start();

            song = 3;

            title();

            seekBar(song3);
        }

        else if(song == 5){

            song1.pause();
            song2.pause();
            song3.pause();
            song4.start();
            song5.pause();
            song6.pause();
            song7.pause();

            song = 4;

            title();

            seekBar(song4);
        }

        else if(song == 6){

            song1.pause();
            song2.pause();
            song3.pause();
            song4.pause();
            song5.start();
            song6.pause();
            song7.pause();

            song = 5;

            title();

            seekBar(song5);
        }

        else{

            song1.pause();
            song2.pause();
            song3.pause();
            song4.pause();
            song5.pause();
            song6.start();
            song7.pause();

            song = 6;

            title();

            seekBar(song6);
        }
    }

    public void play(View view) {

        if(play){

            if(song == 1){
                song1.pause();
                seekBar(song1);
            }

            else if(song == 2){
                song2.pause();
                seekBar(song2);
            }

            else if(song == 3){
                song3.pause();
                seekBar(song3);
            }

            else if(song == 4){
                song4.pause();
                seekBar(song4);
            }

            else if(song == 5){
                song5.pause();
                seekBar(song5);
            }

            else if(song == 6){
                song6.pause();
                seekBar(song6);
            }

            else{
                song7.pause();
                seekBar(song7);
            }
            imgPlay.setAlpha(1f);
            imgPause.setAlpha(0f);

            pause = true;
            play = false;

            title();
        }

        else if(pause){

            if(song == 1){
                song1.start();
                seekBar(song1);
            }

            else if(song == 2){
                song2.start();
                seekBar(song2);
            }

            else if(song == 3){
                song3.start();
                seekBar(song3);
            }

            else if(song == 4){
                song4.start();
                seekBar(song4);
            }

            else if(song == 5){
                song5.start();
                seekBar(song5);
            }

            else if(song == 6){
                song6.start();
                seekBar(song6);
            }

            else{
                song7.start();
                seekBar(song7);
            }

            imgPlay.setAlpha(0f);
            imgPause.setAlpha(1f);

            pause = false;
            play = true;

            title();
        }
    }

    public void next(View view) {
        if(song == 1){

            song1.pause();
            song2.start();
            song3.pause();
            song4.pause();
            song5.pause();
            song6.pause();
            song7.pause();

            song = 2;

            title();

            seekBar(song2);
        }

        else if(song == 2){

            song1.pause();
            song2.pause();
            song3.start();
            song4.pause();
            song5.pause();
            song6.pause();
            song7.pause();

            song = 3;

            title();

            seekBar(song3);
        }

        else if(song == 3){

            song1.pause();
            song2.pause();
            song3.pause();
            song4.start();
            song5.pause();
            song6.pause();
            song7.pause();

            song = 4;

            title();

            seekBar(song4);
        }

        else if(song == 4){

            song1.pause();
            song2.pause();
            song3.pause();
            song4.pause();
            song5.start();
            song6.pause();
            song7.pause();

            song = 5;

            title();

            seekBar(song5);
        }

        else if(song == 5){

            song1.pause();
            song2.pause();
            song3.pause();
            song4.pause();
            song5.pause();
            song6.start();
            song7.pause();

            song = 6;

            title();

            seekBar(song6);
        }

        else if(song == 6){

            song1.pause();
            song2.pause();
            song3.pause();
            song4.pause();
            song5.pause();
            song6.pause();
            song7.start();

            song = 7;

            title();

            seekBar(song7);
        }

        else{

            song1.start();
            song2.pause();
            song3.pause();
            song4.pause();
            song5.pause();
            song6.pause();
            song7.pause();

            song = 1;

            title();

            seekBar(song1);
        }
    }

    public void home(View view) {
        Intent intent = new Intent(this,ScrollingActivity.class);
        song1.pause();
        song2.pause();
        song3.pause();
        song4.pause();
        song5.pause();
        song6.pause();
        song7.pause();

        song_one = false;
        song_two = false;
        song_three = false;
        song_four = false;
        song_five = false;
        song_six = false;
        song_seven = false;

        startActivity(intent);
    }

    public void song(){
        if(song_one){
            song = 1;
            song_two = false;
            song_three = false;
            song_four = false;
            song_five = false;
            song_six = false;
            song_seven = false;
            play = true;

            title();

            song1.start();
            song2.pause();
            song3.pause();
            song4.pause();
            song5.pause();
            song6.pause();
            song7.pause();

            seekBar(song1);
        }

        else if(song_two){
            song = 2;
            song_one = false;
            song_three = false;
            song_four = false;
            song_five = false;
            song_six = false;
            song_seven = false;
            play = true;

            title();

            song1.pause();
            song2.start();
            song3.pause();
            song4.pause();
            song5.pause();
            song6.pause();
            song7.pause();

            seekBar(song2);
        }

        else if(song_three){
            song = 3;
            song_one = false;
            song_two = false;
            song_four = false;
            song_five = false;
            song_six = false;
            song_seven = false;
            play = true;

            title();

            song1.pause();
            song2.pause();
            song3.start();
            song4.pause();
            song5.pause();
            song6.pause();
            song7.pause();

            seekBar(song3);
        }

        else if(song_four){
            song = 4;
            song_one = false;
            song_two = false;
            song_three = false;
            song_five = false;
            song_six = false;
            song_seven = false;
            play = true;

            title();

            song1.pause();
            song2.pause();
            song3.pause();
            song4.start();
            song5.pause();
            song6.pause();
            song7.pause();

            seekBar(song4);
        }

        else if(song_five){
            song = 5;
            song_two = false;
            song_three = false;
            song_four = false;
            song_one = false;
            song_six = false;
            song_seven = false;
            play = true;

            title();

            song1.pause();
            song2.pause();
            song3.pause();
            song4.pause();
            song5.start();
            song6.pause();
            song7.pause();

            seekBar(song5);
        }

        else if(song_six){
            song = 6;
            song_two = false;
            song_three = false;
            song_four = false;
            song_five = false;
            song_one = false;
            song_seven = false;
            play = true;

            title();

            song1.pause();
            song2.pause();
            song3.pause();
            song4.pause();
            song5.pause();
            song6.start();
            song7.pause();

            seekBar(song6);
        }

        else{
            song = 7;
            song_two = false;
            song_three = false;
            song_four = false;
            song_five = false;
            song_six = false;
            song_one = false;
            play = true;

            title();

            song1.pause();
            song2.pause();
            song3.pause();
            song4.pause();
            song5.pause();
            song6.pause();
            song7.start();

            seekBar(song7);
        }
    }

    public void title(){
        if(song == 1){
            songTitle.setText("Faded");
        }

        else if(song == 2){
            songTitle.setText("On My way");
        }

        else if(song == 3){
            songTitle.setText("Are you lonely");
        }

        else if(song == 4){
            songTitle.setText("Do it all for you");
        }

        else if(song == 5){
            songTitle.setText("I Don't Wanna Go");
        }

        else if(song == 6){
            songTitle.setText("All Falls Down");
        }

        else{
            songTitle.setText("Darkside");
        }

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this,"Click the back button",Toast.LENGTH_LONG).show();
    }

    protected void back(View view) {
        Intent intent = new Intent(this,alan.class);
        song1.pause();
        song2.pause();
        song3.pause();
        song4.pause();
        song5.pause();
        song6.pause();
        song7.pause();

        song_one = false;
        song_two = false;
        song_three = false;
        song_four = false;
        song_five = false;
        song_six = false;
        song_seven = false;

        startActivity(intent);
    }

    protected void seekBar(final MediaPlayer mp){
        mp.setLooping(true);
        mp.seekTo(0);
        mp.setVolume(0.5f, 0.5f);
        totalTime = mp.getDuration();



        positionBar.setMax(totalTime);
        positionBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        if (fromUser) {
                            mp.seekTo(progress);
                            positionBar.setProgress(progress);
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );


        // Thread (Update positionBar & timeLabel)
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp.getCurrentPosition();
                        handler.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                }
            }
        }).start();

    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            int currentPosition = msg.what;

            positionBar.setProgress(currentPosition);


            String elapsedTime = createTimeLabel(currentPosition);
            elapsedTimeLabel.setText(elapsedTime);

            String remainingTime = createTimeLabel(totalTime-currentPosition);
            remainingTimeLabel.setText("- " + remainingTime);
        }
    };

    public String createTimeLabel(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }
}
