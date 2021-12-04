package com.example.parcialdam;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME= "DB_Pesona";
    private static DBHelper instance=null;


    public DBHelper( Context context) {
        super(context,DATABASE_NAME , null, 1);
    }
    public static DBHelper getInstance(Context ctx){
        if(instance==null) instance=new DBHelper(ctx);

        return instance;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table persona (" +

                   "id integer primary key autoincrement,"+
                   "nombre text, "+
                   "apellido text" +
                   ");"
        );


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
