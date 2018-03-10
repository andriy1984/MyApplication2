package com.example.andri.myapplication.db.service.core;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.andri.myapplication.db.DBHelper;

/**
 * Created by andri on 10.03.2018.
 */

public abstract class OpenDBService {

    private DBHelper dbHelper;
    private SQLiteDatabase sqLiteDatabase;
    private Context context;

    public SQLiteDatabase getSqLiteDatabase() {
        return sqLiteDatabase;
    }

    public OpenDBService(Context context) {
        this.context = context;
    }

    protected boolean isOpen(){
        return sqLiteDatabase != null
                && dbHelper != null
                && sqLiteDatabase.isOpen();
    }

    protected void open(){
        if (sqLiteDatabase == null || !sqLiteDatabase.isOpen()){
            dbHelper = new DBHelper(context);
            sqLiteDatabase = dbHelper.getWritableDatabase();
        }
    }

    protected void close(){
        if (dbHelper!=null)
            dbHelper.close();
    }

}
