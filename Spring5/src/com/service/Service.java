package com.service;


import com.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    @Qualifier(value = "daoImpl1")
    private Dao dao;

    @Value("abc")
    private String name;

    public void service() {
        dao.add();
        System.out.println("service......" + name);
    }
}
