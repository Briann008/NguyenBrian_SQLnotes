package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataBaseHelper extends SQLiteOpenHelper
{

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Contact2019.db";
    public static final String TABLE_NAME = "Contact2019_table";
    public static final String ID = "ID";
    public static final String COLUMN_NAME_CONTACT = "contact";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TABLE_NAME + " (" + ID + " INTEGER PRIMARY KEY_AUTOINCREMENT" +
                    COLUMN_NAME_CONTACT + " TEXT)";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TABLE_NAME;


    public DataBaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase dn = this.getWritableDatabase(); //TODO: Remove this testing database
        Log.d("Contact App", "DatabaseHelper: constructed database helper");

    }


    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(SQL_CREATE_ENTRIES);
        Log.d("Contact App", "DatabaseHelper: creating database");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL(SQL_CREATE_ENTRIES);
        Log.d("Contact App", "DatabaseHelper: creating database");
        onCreate(db);
    }
}
