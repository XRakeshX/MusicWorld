package com.decoder.musicworld;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;


import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class ScrollingActivity extends AppCompatActivity {

    LinearLayout menu;
    RelativeLayout mainContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        menu = findViewById(R.id.mainmenu);
        mainContent = findViewById(R.id.maincontent);
    }


    public void alan_walker(View view) {
        Intent intent = new Intent(this,alan.class);
        startActivity(intent);
    }

    public void justin_bieber(View view) {

        Intent intent = new Intent(this,justin.class);
        startActivity(intent);
    }


    public void micheal_jackson(View view) {

        Intent intent = new Intent(this,micheal_jackson.class);
        startActivity(intent);
    }

    public void home(View view) {
        menu.setAlpha(0f);
        mainContent.setAlpha(1f);
    }

    public void micilaneous(View view) {

        Intent intent = new Intent(this,songs.class);
        startActivity(intent);
    }

    public void developer(View view) {

        Intent intent = new Intent(this,developer.class);
        startActivity(intent);
    }

    public void menu(View view) {
        menu.setAlpha(1f);
        menu.setTranslationX(1f);
        //mainContent.setAlpha(0f);
    }
}
