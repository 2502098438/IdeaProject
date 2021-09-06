package com.student;

public class Student {

    private String stuName;

    public Student() {
        System.out.println("第一步,通过无参构造器创建bean实例");
    }

    public void setStuName(String stuName) {
        System.out.println("第二步,调用set方法对bean进行赋值");
        this.stuName = stuName;
    }

    public void student(){
        System.out.println("第三步,调用bean的初始化方法");
    }

    public void destoryMethod(){
        System.out.println("第五步,执行销毁方法");
    }
}
