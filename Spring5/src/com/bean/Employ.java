package com.bean;

public class Employ {
    private int eId;
    private String eName;
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void employ() {
        System.out.println("Employ{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", department=" + department +
                '}');
    }
}
