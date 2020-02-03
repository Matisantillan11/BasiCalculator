package com.example.basicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numer1;
    private EditText numer2;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numer1 = (EditText)findViewById(R.id.editText1);
        numer2 = (EditText)findViewById(R.id.editText2);
        result = (TextView)findViewById(R.id.textView);
    }

    //function for add numers

    public void addNumbers  (View addNumbers){

        String value1 = numer1.getText().toString();
        String value2 = numer2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);

        int add = num1 + num2;

        String result1 = String.valueOf(add);
        result.setText(result1);

    }

    //function for subtract numbers

    public void subtractNumbers (View subtract) {

        String value1 = numer1.getText().toString();
        String value2 = numer2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        int subtr;


        if (num1 > num2) {

            subtr = num1 - num2;
            String result1 = String.valueOf(subtr);
            result.setText(result1);

        }
        else {

            subtr = num2 - num1;
            String result1 = String.valueOf(subtr);
            result.setText("-" + result1);

        }

    }
    // function for multiply numbers

    public void multiplyNumbers (View Multiply){

        String value1 = numer1.getText().toString();
        String value2 = numer2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        int multip = num1 * num2;

        String result1 = String.valueOf(multip);
        result.setText(result1);
    }

   
}




