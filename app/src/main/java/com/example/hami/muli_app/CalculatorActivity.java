package com.example.hami.muli_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {
    EditText t1,t2,t3;
    int v1,v2,v3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        t1 = (EditText)findViewById(R.id.value1);
        t2 = (EditText)findViewById(R.id.value2);
        t3 = (EditText)findViewById(R.id.value3);


    }


    public void add(View v){
        v1 = Integer.parseInt(t1.getText().toString());
        v2 = Integer.parseInt(t2.getText().toString());

        v3 = v1+v2;
        t3.setText(""+v3);
    }

    public void sub(View v){
        v1 = Integer.parseInt(t1.getText().toString());
        v2 = Integer.parseInt(t2.getText().toString());
        v3 = v1-v2;
        t3.setText(""+v3);
    }
    public void multiply(View v){
        v1 = Integer.parseInt(t1.getText().toString());
        v2 = Integer.parseInt(t2.getText().toString());
        v3 = v1*v2;
        t3.setText(""+v3);
    }
    public void divide(View v){
        v1 = Integer.parseInt(t1.getText().toString());
        v2 = Integer.parseInt(t2.getText().toString());
        if(v2>0) {
            float v3 = v1 / v2;
            t3.setText("" + v3);
        }else{t3.setText("Error!!");}
    }

    public void clear(View v){
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }

    public void back(View v){
        Intent i = new Intent(this,WelcomeActivity.class);
        this.startActivity(i);
        finish();
    }
}
