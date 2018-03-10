package com.example.andri.myapplication.db.service.core;

import java.util.List;

/**
 * Created by andri on 10.03.2018.
 */

public interface Service <T> {

    void save(T t);

    List<T> getAll();
}
