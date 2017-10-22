package com.example.hami.muli_app;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Sign_UPActivity extends AppCompatActivity {
    String email, pass, pass1;
    String emailcheck,passwordcheck;
    EditText t1, t2, t3;
    connection con;
    SQLiteDatabase db;
    Context c = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);


        t1 = (EditText) findViewById(R.id.email);
        t2 = (EditText) findViewById(R.id.pass);
        t3 = (EditText) findViewById(R.id.pass1);
    }

    public void register(View view) {
        con = new connection(c);
        db = con.getReadableDatabase();
        Cursor cr = con.show(db);

        email = t1.getText().toString();
        pass = t2.getText().toString();
        pass1 = t3.getText().toString();


        if (pass.contentEquals(pass1)) {

            if (cr != null) {
                if (cr.moveToFirst()) {
                    do {
                         emailcheck = cr.getString(cr.getColumnIndex("email"));
                         passwordcheck = cr.getString(cr.getColumnIndex("password"));

                        if (emailcheck.contentEquals(email) || passwordcheck.contentEquals(pass)) {
                            Toast.makeText(c, "USER ALREADY EXISTS", Toast.LENGTH_SHORT).show();
                            break;
                        }


                     }while (cr.moveToNext());

                }if(!email.equals(emailcheck)||!pass.equals(passwordcheck)){
                    db = con.getWritableDatabase();
                    con.insert(email, pass, db);
                    Toast.makeText(c, "New User Registered", Toast.LENGTH_SHORT).show();
                }
            }else{Toast.makeText(c, "No Record Exists!", Toast.LENGTH_SHORT).show();}


        }else{Toast.makeText(c, "Password Not Matched!!", Toast.LENGTH_SHORT).show();}
    }


    public void back(View v) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);

    }


}


