package com.example.hami.muli_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RecordActivity extends AppCompatActivity {

    Button addbutton,delbutton,updatebutton,showbutton,clearbutton,backbutton;
    EditText id,name,fname,batchno,rollno,address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        id = (EditText) findViewById(R.id.f1);
        name = (EditText)findViewById(R.id.f2);
        fname = (EditText)findViewById(R.id.f3);
        rollno =(EditText)findViewById(R.id.f4);
        batchno = (EditText)findViewById(R.id.f5);
        address = (EditText)findViewById(R.id.f6);



    }
    //Clear Fields Method
    public void clear(View v){
        id.setText("");
        name.setText("");
        fname.setText("");
        batchno.setText("");
        rollno.setText("");
        address.setText("");
    }

    public void back(View v){
        Intent i1 = new Intent(this,WelcomeActivity.class);
        this.startActivity(i1);
        finish();
    }
}
