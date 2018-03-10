package com.example.andri.myapplication.db.dao.core;

import android.database.Cursor;

import java.util.List;

/**
 * Created by andri on 10.03.2018.
 */

public interface Dao <T> {

    void save(T t);
    List<T> getAll();
    List<T>parseCursor(Cursor cursor);
}
