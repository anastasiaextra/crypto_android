package com.berkeley.crypto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button convertBtn = (Button) findViewById(R.id.button3);
    convertBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            EditText firstNumEditText = (EditText) findViewById(R.id.editText9);
            EditText secondNumEditText = (EditText) findViewById(R.id.editText10);
            TextView resultTextView = (TextView) findViewById(R.id.editText10);

            int currency1 = Integer.parseInt(firstNumEditText.getText().toString());
            int currency2 = Integer.parseInt(secondNumEditText.getText().toString());
            int result = (int) (currency1/ 0.00029);
            resultTextView.setText(result + "");


            Button revertBtn = (Button) findViewById(R.id.button4);
            revertBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText firstNumEditText = (EditText) findViewById(R.id.editText9);
                    EditText secondNumEditText = (EditText) findViewById(R.id.editText10);
                    TextView resultTextView = (TextView) findViewById(R.id.editText9);

                    int currency1 = Integer.parseInt(firstNumEditText.getText().toString());
                    int currency2 = Integer.parseInt(secondNumEditText.getText().toString());
                    int result = (int) (currency2 * 0.00029);
                    resultTextView.setText(result + "");


                }
            });
            {

            }


        }
    });}}