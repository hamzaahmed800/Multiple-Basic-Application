package com.example.hami.muli_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class WelcomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


    }

    public void Record(View v){
        Intent i1 = new Intent(this,RecordActivity.class);
        this.startActivity(i1);
    }
    public void Currency(View v){
        Intent i2 = new Intent(this,CurrencyActivity.class);
        this.startActivity(i2);
    }
    public void Calculator(View v){
        Intent i3 = new Intent(this,CalculatorActivity.class);
        this.startActivity(i3);
    }
    public void Marksheet(View v){
        Intent i4 = new Intent(this,MarksheetActivity.class);
        this.startActivity(i4);
    }
    public void exit(View v){
        Intent i4 = new Intent(this,LoginActivity.class);
        startActivity(i4);


    }


}
