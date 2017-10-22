package com.example.hami.muli_app;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CurrencyActivity extends AppCompatActivity {
    EditText t1,t2;
    Button con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_conveter);

        t1 = (EditText)findViewById(R.id.dollarfld);
        t2 = (EditText)findViewById(R.id.pakfld);
        con = (Button)findViewById(R.id.convert);
    }

    public void convert(View v){
        int val = Integer.parseInt(t1.getText().toString());
        int dollar = val*105;
        t2.setText(""+dollar);
    }

    public void clear(View v){
        t1.setText("");
        t2.setText("");
    }

    public void back(View v){
        Intent i = new Intent(this,WelcomeActivity.class);
        startActivity(i);

    }
}
