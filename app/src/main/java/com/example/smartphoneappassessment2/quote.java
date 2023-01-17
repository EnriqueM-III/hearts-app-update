package com.example.smartphoneappassessment2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class quote extends AppCompatActivity {
    TextView quotetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);


        //Retrieve the data from the intent
        String nameA = getIntent().getStringExtra("nameA");
        String nameB = getIntent().getStringExtra("nameB");

        //Find the TextView and set the text
        quotetext = findViewById(R.id.quotetext);
        quotetext.setText("Love is in the air for " + nameA + " and " + nameB + "!!!");

    }
}