package com.polapainsoftware.numbersystemcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText dec, bin, oct, hex;
    int test = 11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dec = (EditText) findViewById(R.id.dec);
        bin = (EditText) findViewById(R.id.bin);
        oct = (EditText) findViewById(R.id.oct);
        hex = (EditText) findViewById(R.id.hex);

        dec.setText(test);

    }
}
