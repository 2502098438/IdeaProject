package com.dao.impl;

import com.dao.Dao;
import org.springframework.stereotype.Repository;

@Repository(value = "daoImpl1")
public class DaoImpl implements Dao {
    @Override
    public void add() {
        System.out.println("Dao...add方法");
    }
}
