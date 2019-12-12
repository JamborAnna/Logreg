package com.example.logreg;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.jetbrains.annotations.NotNull;

public class AdatbazisSegito extends SQLiteOpenHelper {
    public static final String DATABASE_NAME= "felhasznalo.db";
    public static final String TABLE_NAME= "felhasznalo";

    public static final String COL_1= "ID";
    public static final String COL_2= "EMAIL";
    public static final String COL_3= "FELHNEV";
    public static final String COL_4= "JELSZO";
    public static final String COL_5= "TELJESNEV";

    public  AdatbazisSegito(Context context) {super(context,DATABASE_NAME,null,1);}

    @Override
    public  void  onCreate(@NotNull SQLiteDatabase sqLiteDatabase){

        sqLiteDatabase.execSQL ("CREATE TABLE "+TABLE_NAME + "( ID INTEGER PRIMARY KEY AUTOINCREMENT,EMAIL TEXT,FELHNEV TEXT, JELSZO TEXT, TELJESNEV TEXT )");
    }
    @Override
    public  void  onUpgrade(@org.jetbrains.annotations.NotNull SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion){
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }


}
