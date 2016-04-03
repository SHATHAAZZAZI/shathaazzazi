package com.example.android.food;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {
    private Button italy;
    private Button france;
    private Button jordan;
    private Button turkey;


    MediaPlayer sound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sound= MediaPlayer.create(this,R.raw.soft);

        italy = (Button) findViewById(R.id.italy);
        italy.setOnClickListener(clickButoon);

        france = (Button) findViewById(R.id.france);
        france.setOnClickListener(clickButoon1);

        jordan = (Button) findViewById(R.id.jordan);
        jordan.setOnClickListener(clickButoon2);

        turkey = (Button) findViewById(R.id.turkey);
        turkey.setOnClickListener(clickButoon3);

    }

    ;
    public void play (View v)
    {
        sound.start();


    }

    public View.OnClickListener clickButoon =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent italy1 = new Intent(MainActivity.this, italy.class);
                    startActivity(italy1);
                }
            };

    public View.OnClickListener clickButoon1 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent france1 = new Intent(MainActivity.this, france.class);
                    startActivity(france1);

                }
            };
    public View.OnClickListener clickButoon2 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent jordan1 = new Intent(MainActivity.this, jordan.class);
                    startActivity(jordan1);

                }
            };
    public View.OnClickListener clickButoon3 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent turkey1 = new Intent(MainActivity.this, turkey.class);
                    startActivity(turkey1);

                }

                ;

            };


}











