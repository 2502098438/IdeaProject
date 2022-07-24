package com.service;

import com.dao.impl.UserDaoImpl;

public class UserService {

    private UserDaoImpl userDao;

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public void userService() {
        System.out.println("userService.......");
        userDao.userDao();
    }
}
