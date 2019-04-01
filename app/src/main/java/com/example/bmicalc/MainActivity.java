package com.example.bmicalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private double result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText height = findViewById(R.id.height);
                EditText weight = findViewById(R.id.weight);
                TextView bmi = (TextView) findViewById(R.id.bmi);

                double a = Integer.parseInt(height.getText().toString());
                double b = Integer.parseInt(weight.getText().toString());
                if(a > 100){
                    a = a / 100;
                } else if(a >= 2.5 & a <= 99){
                    Toast.makeText(MainActivity.this,
                            "Check if your height is properly set in either meters or CM", Toast.LENGTH_LONG).show();
                }
                result = b/(a*a);

                bmi.setText("BMI: " + result);

            }
        });

    }

}
