package com.example.android.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double num = 0;
    private int operator = 1;
    private boolean readyToClear = false;
    private boolean hasChanged = false;
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText crunchIfyEditText;
    float mValueOne, mValueTwo;
    boolean crunchIfyAddition, mSubtract, crunchIfyMultiplication, crunchIfyDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      button0 =  findViewById(R.id.button0);
        button1 =  findViewById(R.id.button1);
        button2 =  findViewById(R.id.button2);
        button3 =  findViewById(R.id.button3);
        button4 =  findViewById(R.id.button4);
        button5 =  findViewById(R.id.button5);
        button6 =  findViewById(R.id.button6);
        button7 =  findViewById(R.id.button7);
        button8 =  findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 =  findViewById(R.id.button10);
        buttonAdd =  findViewById(R.id.buttonadd);
        buttonSub =  findViewById(R.id.buttonsub);
        buttonMul =  findViewById(R.id.buttonmul);
        buttonDivision =  findViewById(R.id.buttondiv);
        buttonC =  findViewById(R.id.buttonC);
        buttonEqual =  findViewById(R.id.buttoneql);
        crunchIfyEditText =  findViewById(R.id.edt1);

        button1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        crunchIfyEditText.setText(swap(crunchIfyEditText.getText().toString()) + "1");
        }
        });
        button2.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        crunchIfyEditText.setText(swap(crunchIfyEditText.getText().toString()) + "2");
        }
        });

        button3.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        crunchIfyEditText.setText(swap(crunchIfyEditText.getText().toString()) + "3");
        }
        });

        button4.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        crunchIfyEditText.setText(swap(crunchIfyEditText.getText().toString()) + "4");
        }
        });

        button5.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        crunchIfyEditText.setText(swap(crunchIfyEditText.getText().toString()) + "5");
        }
        });

        button6.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        crunchIfyEditText.setText(swap(crunchIfyEditText.getText().toString()) + "6");
        }
        });

        button7.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        crunchIfyEditText.setText(swap(crunchIfyEditText.getText().toString()) + "7");
        }
        });

        button8.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        crunchIfyEditText.setText(swap(crunchIfyEditText.getText().toString()) + "8");
        }
        });
        button9.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        crunchIfyEditText.setText(swap(crunchIfyEditText.getText().toString()) + "9");
        }
        });
        button0.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        crunchIfyEditText.setText(swap(crunchIfyEditText.getText().toString()) + "0");
        }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        if (crunchIfyEditText == null) {
        crunchIfyEditText.setText(mValueOne+ "" +mValueTwo);
        } else {
        mValueOne = Float.parseFloat(crunchIfyEditText.getText() + "");
        crunchIfyAddition = true;
        crunchIfyEditText.setText(null);// don’t set text to null
        }
        }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        mValueOne = Float.parseFloat(crunchIfyEditText.getText() + "");
        mSubtract = true;
        crunchIfyEditText.setText(null);// don’t set text to null
        }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        mValueOne = Float.parseFloat(crunchIfyEditText.getText() + "");
        crunchIfyMultiplication = true;
        crunchIfyEditText.setText(null);// don’t set text to null
        }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        mValueOne = Float.parseFloat(crunchIfyEditText.getText() + "");
        crunchIfyDivision = true;
        crunchIfyEditText.setText(null);
        }
        });


        buttonEqual.setOnClickListener(new Button.OnClickListener() {
public void onClick(View v) {
        mValueTwo = Float.parseFloat(crunchIfyEditText.getText() + "");
        if (crunchIfyAddition == true) {
        float value = mValueOne + mValueTwo;
        if (isInteger(value) == true)
        crunchIfyEditText.setText(Math.round(value) + "");
        else
        crunchIfyEditText.setText(value + "");
        crunchIfyAddition = false;
        }

        if (mSubtract == true) {
        float value = mValueOne - mValueTwo;
        if (isInteger(value) == true)
        crunchIfyEditText.setText(Math.round(value) + "");
        else
        crunchIfyEditText.setText(value + "");

        mSubtract = false;
        }

        if (crunchIfyMultiplication == true) {
        float value = mValueOne * mValueTwo;
        if (isInteger(value) == true)
        crunchIfyEditText.setText(Math.round(value) + "");
        else
        crunchIfyEditText.setText(value + "");
        crunchIfyMultiplication = false;
        }

        if (crunchIfyDivision == true) {
        float value = mValueOne / mValueTwo;
        if (isInteger(value) == true)
        crunchIfyEditText.setText(Math.round(value) + "");
        else
        crunchIfyEditText.setText(value + "");
        crunchIfyDivision = false;
        }
        ;
        }
        });


        buttonC.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        reset();
        }
        });

        button10.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        crunchIfyEditText.setText(crunchIfyEditText.getText() + ".");
        }
        });

        }

private void reset() {
        num = 0;
        crunchIfyEditText.setText("0");
        crunchIfyEditText.setSelection(1);
        operator = 1;
        }

private boolean isInteger(float number) {
        if (number == (int) number) {
        return true;
        } else {
        return false;
        }
        }

private String swap(String text) {
        if (text.equals("0")) {
        return "";
        } else {
        return text;
        }
        }
private void display(String number) {
        TextView quantityTextView =  findViewById(R.id.edt1);
        quantityTextView.setText("" + number);
        }

        }
