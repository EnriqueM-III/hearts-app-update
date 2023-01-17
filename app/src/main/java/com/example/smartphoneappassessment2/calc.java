package com.example.smartphoneappassessment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

public class calc extends AppCompatActivity {


    EditText personA,personA2;
    Button calculatebtn,quotebtn;
    TextView percentage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        getSupportActionBar().hide();


        personA =findViewById(R.id.personA);
        personA2 =findViewById(R.id.personA2);
        calculatebtn =findViewById(R.id.calculatebtn);
        percentage =findViewById(R.id.percentage);
        quotebtn =findViewById(R.id.quotebtn);

        calculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameA = personA.getText().toString();
                String nameB = personA2.getText().toString();

                String sum = nameA + nameB;

                sum = sum.toLowerCase(Locale.ROOT);

                int value =sum.hashCode();

                Random random = new Random(value);

                String result = (random.nextInt(100)+1+"%");

                String easteregg = ("SELFLOVE");


                if (nameA.equals("")||nameB.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter both fields!", Toast.LENGTH_SHORT).show();

                }
                if (nameA.equals("ENRIQUE")||nameB.equals("ENRIQUE")) {
                    percentage.setText(easteregg);

                }  else percentage.setText(result);





            }
        });

        quotebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameA = personA.getText().toString();
                String nameB = personA2.getText().toString();

                if (nameA.equals("")||nameB.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter both fields!", Toast.LENGTH_SHORT).show();
                } else {
                    //Create an Intent to start the next activity
                    Intent intent = new Intent(calc.this, quote.class);
                    //Put the data into the intent
                    intent.putExtra("nameA", nameA);
                    intent.putExtra("nameB", nameB);
                    //Start the activity
                    startActivity(intent);
                }
            }
        });


            }
}