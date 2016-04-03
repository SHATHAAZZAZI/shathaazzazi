package com.example.android.food;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class turkey extends AppCompatActivity {
    private Button corba;
    private Button kumpir;
    private Button  kofte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkey);

        corba = (Button) findViewById(R.id.corba);
        corba.setOnClickListener(clickButoon7);

        kumpir = (Button) findViewById(R.id.kumpir);
       kumpir.setOnClickListener(clickButoon8);

       kofte = (Button) findViewById(R.id.kofte);
        kofte.setOnClickListener(clickButoon9);


    }

    ;

    public View.OnClickListener clickButoon7 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent corba1 = new Intent(turkey.this,corba.class);
                    startActivity(corba1);
                }
            };

    public View.OnClickListener clickButoon8 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent   kumpir1 = new Intent(turkey.this,kumpir.class);
                    startActivity(  kumpir1);

                }
            };
    public View.OnClickListener clickButoon9 =
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kofte1 = new Intent(turkey.this,kofte.class);
                    startActivity(kofte1);

                }


            };
}
