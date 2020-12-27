package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    TextView text;
    EditText number1,number2,number3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button=findViewById(R.id.button);

        this.text=findViewById(R.id.text);
        this.number1=findViewById(R.id.number1);
        this.number2=findViewById(R.id.number2);
        this.number3=findViewById(R.id.number3);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double D,x1,x2;
        String t1 = number1.getText().toString();
        String t2 = number2.getText().toString();
        String t3 = number3.getText().toString();
        double a = Double.parseDouble(t1);
        double b = Double.parseDouble(t2);
        double c = Double.parseDouble(t3);
    D = Math.sqrt(b*b - 4*a*c);
    if (D < 0){
        text.setText("ERROR");
    } else if(D==0){

        text.setText("x = " + String.valueOf(String.format(Locale.US, "%.2f", -b/(2  * a))));

    } else{

        x1 = ((-b)-D)/2*a;
        x2 = ((-b)+D)/2*a;

        text.setText(String.valueOf(x1));
        text.setText("x1 = " + String.valueOf(String.format(Locale.US, "%.2f", x1)) + '\n' + "x2 = " + String.valueOf(String.format(Locale.US, "%.2f", x2)));
    }



    }
}