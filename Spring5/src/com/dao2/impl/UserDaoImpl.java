package com.dao2.impl;

import com.dao2.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String update(String s) {
        return s;
    }
}
