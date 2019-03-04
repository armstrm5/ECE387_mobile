package com.example.jj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    public int number =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void count(View view) {
        number = number+1;
        display(number);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.count);
        quantityTextView.setText("" + number);
    }
}
