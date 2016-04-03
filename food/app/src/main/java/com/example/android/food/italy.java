package com.example.android.food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class italy extends AppCompatActivity {
    private Button pasta;
    private Button pizza;
    private Button risotto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italy);

        pasta = (Button) findViewById(R.id.pasta);
        pasta.setOnClickListener(clickButoon4);

        pizza = (Button) findViewById(R.id.pizza);
        pizza.setOnClickListener(clickButoon5);

        risotto = (Button) findViewById(R.id.risotto);
        risotto.setOnClickListener(clickButoon6);


    }

    ;

    public View.OnClickListener clickButoon4 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pasta1 = new Intent(italy.this, pasta.class);
                    startActivity(pasta1);
                }
            };

    public View.OnClickListener clickButoon5 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pizza1 = new Intent(italy.this, pizza.class);
                    startActivity(pizza1);

                }
            };
    public View.OnClickListener clickButoon6 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pizza1 = new Intent(italy.this, risotto.class);
                    startActivity(pizza1);

                }


            };
}
