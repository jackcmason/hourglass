package com.example.jm97.hourglass;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Activities.db";
    public static final String TABLE_NAME = "activity_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "ACTIVITY";
    public static final String COL_3 = "CATAGORY";
    public static final String COL_4 = "STARTTIME";
    public static final String COL_5 = "ENDTIME";

    public DatabaseHelper(Context context) { //@androidx.annotation.Nullable ??

        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db =  this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, ACTIVITY TEXT, CATAGORY TEXT, STARTTIME TEXT, ENDTIME TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
}
