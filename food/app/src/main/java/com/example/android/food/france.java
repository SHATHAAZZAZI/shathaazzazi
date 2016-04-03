package com.example.android.food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class france extends AppCompatActivity {
    private Button flamiche;
    private Button retaouille;
    private Button souffle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_france);

       flamiche = (Button) findViewById(R.id.flamiche);
        flamiche.setOnClickListener(clickButoon7);

       retaouille = (Button) findViewById(R.id.retaouille);
        retaouille.setOnClickListener(clickButoon8);

        souffle = (Button) findViewById(R.id.souffle);
        souffle.setOnClickListener(clickButoon9);


    }

    ;

    public View.OnClickListener clickButoon7 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent flamiche1 = new Intent(france.this,flamiche.class);
                    startActivity(flamiche1);
                }
            };

    public View.OnClickListener clickButoon8 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent  retaouille1 = new Intent(france.this,retaouille.class);
                    startActivity( retaouille1);

                }
            };
    public View.OnClickListener clickButoon9 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent souffle1 = new Intent(france.this,souffle.class);
                    startActivity(souffle1);

                }


            };
}
