package com.example.andri.myapplication.db.service.core;

import android.content.Context;

import com.example.andri.myapplication.User;
import com.example.andri.myapplication.db.dao.UserDao;

import java.util.List;

/**
 * Created by andri on 10.03.2018.
 */

public class UserService extends OpenDBService implements Service<User> {
    public UserService(Context context) {
        super(context);
    }

    @Override
    public void save(User user) {
        try {
            if(!isOpen()){
                open();
            }
            new UserDao(getSqLiteDatabase()).save(user);
        }finally {
            if (isOpen()){
                close();
            }
        }

    }

    @Override
    public List<User> getAll() {
        try {
            if(!isOpen()){
                open();
            }
            return  new UserDao(getSqLiteDatabase()).getAll();
        }finally {
            if (isOpen()){
                close();
            }
        }

    }
}
