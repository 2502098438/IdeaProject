package com.factoryBean;

import com.collectionType.Courses;
import org.springframework.beans.factory.FactoryBean;

public class Bean implements FactoryBean<Courses> {
    @Override
    public Courses getObject() throws Exception {
        Courses courses = new Courses();
        courses.setcName("aaaaa");
        return courses;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
