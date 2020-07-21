package com.example.markstotaller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer TOTAL = 0;
    Integer CURRENT = 0;
    TextView TOTAL_DISPLAY;
    TextView CURRENT_DISPLAY;
    Integer Extra = 0;
    String EXTRA = "";
    String total = "";
    String current = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TOTAL_DISPLAY = findViewById(R.id.total);
        CURRENT_DISPLAY = findViewById(R.id.current);
    }

    public void add1(View view) {
        CURRENT = 1;
        TOTAL += 1;
        total = TOTAL + EXTRA;
        current = Integer.toString(CURRENT);
        TOTAL_DISPLAY.setText(total);
        CURRENT_DISPLAY.setText(current);
    }

    public void add2(View view) {
        CURRENT = 2;
        TOTAL += 2;
        total = TOTAL + EXTRA;
        current = Integer.toString(CURRENT);
        TOTAL_DISPLAY.setText(total);
        CURRENT_DISPLAY.setText(current);
    }

    public void add3(View view) {
        CURRENT = 3;
        TOTAL += 3;
        total = TOTAL + EXTRA;
        current = Integer.toString(CURRENT);
        TOTAL_DISPLAY.setText(total);
        CURRENT_DISPLAY.setText(current);
    }

    public void add4(View view) {
        CURRENT = 4;
        TOTAL += 4;
        total = TOTAL + EXTRA;
        current = Integer.toString(CURRENT);
        TOTAL_DISPLAY.setText(total);
        CURRENT_DISPLAY.setText(current);
    }
    public void add5(View view) {
        CURRENT = 5;
        TOTAL += 5;
        total = TOTAL + EXTRA;
        current = Integer.toString(CURRENT);
        TOTAL_DISPLAY.setText(total);
        CURRENT_DISPLAY.setText(current);
    }

    public void reset(View view) {
        CURRENT = 0;
        TOTAL = 0;
        EXTRA = "";
        Extra = 0;
        total = TOTAL + EXTRA;
        current = Integer.toString(CURRENT);
        TOTAL_DISPLAY.setText(total);
        CURRENT_DISPLAY.setText(current);
    }

    public void add0(View view) {

        if(Extra == 1)
        {
            Extra = 0;
            EXTRA = "";
            TOTAL = TOTAL + 1;
        }
        else
        {
            Extra = 1;
            EXTRA = ".5";
        }

        total = TOTAL + EXTRA;
        TOTAL_DISPLAY.setText(total);
        CURRENT_DISPLAY.setText("0.5");

    }
}
