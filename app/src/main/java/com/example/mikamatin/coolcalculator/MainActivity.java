package com.example.mikamatin.coolcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //function called when 7 is pressed
    public void buttonSevenPressed(View view) {
        TextView result = (TextView)findViewById(R.id.result_text);
        result.setText(R.string.seven);
    }
    //function called when 8 is pressed
    public void buttonEightPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.eight);
    }
    //function called when 9 is pressed
    public void buttonNinePressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.nine);
    }
}
