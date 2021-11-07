package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String operator;
    int x1, x2;

    Button buttonPlus, buttonMinus, button1, buttonEqual;
    TextView textExpression, textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findButton();
        inputX1();
        inputOperator();
        inputX2();
        calculate();
    }

    void findButton(){
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        button1 = findViewById(R.id.button1);
        textExpression = findViewById(R.id.textExpression);
        textResult = findViewById(R.id.textResult);
        buttonEqual = findViewById(R.id.buttonEqual);
    }

    void inputX1(){
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textExpression.setText(textExpression.getText() + "1");
                x1 = 1;
            }
        });
    }

    void inputOperator(){
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textExpression.setText(textExpression.getText() + "+");
                operator = "+";
            }
        });
    }

    void inputX2(){
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textExpression.setText(textExpression.getText() + "1");
                x2 = 4;
            }
        });
    }

    void calculate(){
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textResult.setText(String.valueOf(x1+x2));
            }
        });
    }


}