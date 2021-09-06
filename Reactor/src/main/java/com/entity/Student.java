package com.entity;

public class Student {
    private int stuId;
    private String stuName;
    private String gender;

    public Student() {
    }

    public Student(int stuId, String stuName, String gender) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.gender = gender;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
