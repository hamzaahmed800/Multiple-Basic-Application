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

public class LoginActivity extends AppCompatActivity {
    String email, password;
    String emailcheck,passwordcheck;
    EditText t1, t2;
    connection con;
    SQLiteDatabase db;
    Context c = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        t1 = (EditText) findViewById(R.id.email);
        t2 = (EditText) findViewById(R.id.password);

    }


    public void login(View v) {
        con = new connection(c);
        db = con.getReadableDatabase();
        Cursor cr = con.show(db);

        email = t1.getText().toString();
        password = t2.getText().toString();

            if (cr != null) {
                if (cr.moveToFirst()) {
                    do {
                         emailcheck = cr.getString(cr.getColumnIndex("email"));
                         passwordcheck = cr.getString(cr.getColumnIndex("password"));

                        if (emailcheck.contentEquals(email) && passwordcheck.contentEquals(password)) {
                            Toast.makeText(c, "USER VERIFIED", Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(this, WelcomeActivity.class);
                            startActivity(i);
                            break;
                        }

                    } while (cr.moveToNext());
                 }if(!email.equals(emailcheck)&& !password.equals(passwordcheck))
                         {Toast.makeText(c,"Not a USER !!",Toast.LENGTH_SHORT).show();}

            }else{Toast.makeText(c, "No Record Exists!", Toast.LENGTH_SHORT).show();}



    }

    public void sign_up(View v) {

        Intent i = new Intent(this, Sign_UPActivity.class);
        startActivity(i);

    }

}