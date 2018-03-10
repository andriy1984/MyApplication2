package com.example.andri.myapplication.db;

/**
 * Created by andri on 10.03.2018.
 */

public class Resource {

    public static final String DB_NAME = "it_claster";
    public static final int DB_VERSION = 1;

    public static final class User{

        public static final String TABLE_NAME = "user";
        public static final String ID = "id";
        public static final String NAME = "name";

        public static final String CREATE_TABLE =
                "create table "
                + TABLE_NAME
                + " ("
                + ID
                + " integer primary key autoincrement, "
                + " text(255));";
    }
}
