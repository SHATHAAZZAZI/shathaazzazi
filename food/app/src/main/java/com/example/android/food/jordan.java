package com.example.android.food;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class jordan extends AppCompatActivity {
    private Button mansaf;
    private Button zarb;
    private Button  olives;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jordan);

        mansaf = (Button) findViewById(R.id.mansaf);
        mansaf.setOnClickListener(clickButoon7);

        zarb = (Button) findViewById(R.id.zarb);
        zarb.setOnClickListener(clickButoon8);

        olives = (Button) findViewById(R.id.olives);
        olives.setOnClickListener(clickButoon9);


    }

    ;

    public View.OnClickListener clickButoon7 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mansaf1 = new Intent(jordan.this,mansaf.class);
                    startActivity(mansaf1);
                }
            };

    public View.OnClickListener clickButoon8 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent   zarp1 = new Intent(jordan.this,zarb.class);
                    startActivity(zarp1);

                }
            };
    public View.OnClickListener clickButoon9 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent olives1 = new Intent(jordan.this,olives.class);
                    startActivity(olives1);

                }


            };
}
