package entity;

public class Employee {
    private int id;
    private String stuName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                '}';
    }
}
