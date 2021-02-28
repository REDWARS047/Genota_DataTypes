package com.example.genota_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displaytxt);



        String firstname = "Carl Christian";
        char middleinitial = 'L';
        String lastname = "Genota";
        int myAge = 18;
        float myDreamTVLGrade = 100;
        double mymoney = 99999.99;


        display.setText("My name is"+firstname+ " "
                +String.valueOf(middleinitial)+ " "
                +lastname+ ". \nI want my grade in TVL3 to be "
                +String.valueOf(myDreamTVLGrade));

        boolean amIHakdog = false;

    }
}