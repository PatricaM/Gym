package com.example.gym;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String databaseName="Gym.db";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "Gym.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase Project_Gym) {
        Project_Gym.execSQL("create Table allusers(email TEXT primary key, pasword TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase Project_Gym, int oldVersion, int newVersion) {
        Project_Gym.execSQL("drop Table if exists allusers");
    }
    public Boolean insertData(String email, String password){
        SQLiteDatabase Project_Gym = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("email",email);
        contentValues.put("password", password);
        long result = Project_Gym.insert("allusers", null, contentValues);

        if (result == -1){
            return false;
        }
        else {
            return true;
        }
    }
    public Boolean checkEmail(String email){
        SQLiteDatabase Project_Gym=this.getWritableDatabase();
        Cursor cursor = Project_Gym.rawQuery("Select * from allusers where email = ?", new String[]{email});

        if (cursor.getCount() > 0){
            return true;
        }
        else {
            return false;
        }
    }
    public Boolean checkEmailPassword(String email, String password){
        SQLiteDatabase Project_Gym=this.getWritableDatabase();
        Cursor cursor = Project_Gym.rawQuery("Select * from allusers where email = ? and password = ?", new String[]{email, password});

        if (cursor.getCount() > 0){
            return true;
        }
        else {
            return false;
        }
    }
}
