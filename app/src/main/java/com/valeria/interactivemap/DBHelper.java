package com.valeria.interactivemap;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "CountriesDB";
    public static final String TABLE_CONTACTS = "Countries";
    public static final String KEY_ID = "_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_CAPITAL = "capital";
    public static final String KEY_PRESIDENT = "president";
    public static final String KEY_CURRENCY = "currency";
    public static final String KEY_HISTORY = "history";
    public static final String KEY_IMAGE = "flag";
    public static final String CREATE_TABLE = "create table if not exists " + TABLE_CONTACTS + "(" + KEY_ID
            + " integer primary key," + KEY_NAME + " text," + KEY_CAPITAL + " text," + KEY_PRESIDENT + " text," + KEY_CURRENCY + " text," + KEY_HISTORY + " text," + KEY_IMAGE + " text" + ")";


    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_CONTACTS);
        onCreate(db);

    }
}