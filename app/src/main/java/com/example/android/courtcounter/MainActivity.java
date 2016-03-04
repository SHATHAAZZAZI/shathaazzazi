package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int I ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void I3(View view) {
        I = I + 3;
        display(I);


    }

    public void I2(View view) {
        I = I + 2;
        display(I);


    }

    public void I1(View view) {
        I = I + 1;
        display(I);


    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);

        quantityTextView.setText("" + number);

    }
    public static int z;

    public void I6(View view) {
        z = z + 3;
        display1(z);


    }

    public void I5(View view) {
        z = z + 2;
        display1(z);


    }

    public void I4(View view) {
        z = z + 1;
        display1(z);


    }

    private void display1(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view2);

        quantityTextView.setText("" + number);

    }
    public void RESET(View view) {

        I=0;
        z=0;
        display1(z);
        display(I);


    }

}
