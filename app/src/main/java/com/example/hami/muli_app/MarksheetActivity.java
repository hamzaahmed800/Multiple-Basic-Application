package com.example.hami.muli_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MarksheetActivity extends AppCompatActivity {
    EditText t0,t00,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marksheet);
        t10 = (EditText)findViewById(R.id.namefld);
        t00 = (EditText)findViewById(R.id.rollnofld);
        t1 = (EditText)findViewById(R.id.t1);
        t2 = (EditText)findViewById(R.id.t2);
        t3 = (EditText)findViewById(R.id.t3);
        t4 = (EditText)findViewById(R.id.t4);
        t5 = (EditText)findViewById(R.id.t5);
        t6 = (EditText)findViewById(R.id.t6);
        t7 = (EditText)findViewById(R.id.t7);
        t8 = (EditText)findViewById(R.id.t8);
        t9 = (EditText)findViewById(R.id.t9);
        t10 = (EditText)findViewById(R.id.t10);
        t11 = (EditText)findViewById(R.id.t11);
        t12 = (EditText)findViewById(R.id.t12);

    }

    public void marksheet_back(View v){
        Intent i1 = new Intent(this,WelcomeActivity.class);
        this.startActivity(i1);
        finish();
    }
    public void show(View v){

    }
}
