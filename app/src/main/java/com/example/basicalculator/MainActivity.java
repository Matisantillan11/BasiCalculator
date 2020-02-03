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

    public void addNumers  (View addNumers){

        String value1 = numer1.getText().toString();
        String value2 = numer2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);

        int add = num1 + num2;

        String result1 = String.valueOf(add);
        result.setText(result1);
    }
}
