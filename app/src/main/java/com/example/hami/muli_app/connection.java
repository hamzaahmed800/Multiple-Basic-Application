package com.example.hami.muli_app;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class connection extends SQLiteOpenHelper {



    connection(Context c){

        super(c,"multi_App",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table loginData(id integer primary key autoincrement,email text,password text)");

    }

    public void insert(String email,String password,SQLiteDatabase db){
        ContentValues cv = new ContentValues();
        cv.put("email",email);
        cv.put("password",password);

        db.insert("loginData",null,cv);

    }

    public Cursor show(SQLiteDatabase db){
        Cursor c = db.rawQuery("select * from loginData",null);
        return c;

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

