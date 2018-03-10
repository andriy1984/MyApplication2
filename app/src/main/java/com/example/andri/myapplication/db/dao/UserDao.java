package com.example.andri.myapplication.db.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.andri.myapplication.User;
import com.example.andri.myapplication.db.Resource;
import com.example.andri.myapplication.db.dao.core.Dao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andri on 10.03.2018.
 */

public class UserDao implements Dao<User> {
    public UserDao(SQLiteDatabase sqLiteDatabase) {
    }

    @Override
    public void save(User user) {

    }

    private SQLiteDatabase sqLiteDatabase;

    private ContentValues UserContentValue(User user) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Resource.User.ID, user.getId());
        contentValues.put(Resource.User.NAME, user.getName());
        return contentValues;
    }


    @Override
    public List<User> getAll(){
        Cursor cursor = sqLiteDatabase.rawQuery(
                "select* from "
                        +Resource.User.TABLE_NAME,
                null
        );

        return null;
    }

    @Override
    public List<User> parseCursor(Cursor cursor) {
        List<User> users =new ArrayList<>();
        if (cursor!= null && cursor.moveToFirst()){
            do {
                int id = cursor.getInt(cursor.getColumnIndex(Resource.User.ID));
                String name = cursor.getString(cursor.getColumnIndex(Resource.User.NAME));
                users.add(new User(id, name));
            }while (cursor.moveToNext());
        }
        if (cursor != null) {
            cursor.close();
        }


        return users;
    }
}
