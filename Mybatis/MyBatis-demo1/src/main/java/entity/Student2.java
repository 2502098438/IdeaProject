package entity;

public class Student2 {
    private int StuId;
    private String StuName;
    private String StuEmail;

    public int getStuId() {
        return StuId;
    }

    public void setStuId(int stuId) {
        StuId = stuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public String getStuEmail() {
        return StuEmail;
    }

    public void setStuEmail(String stuEmail) {
        StuEmail = stuEmail;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "StuId=" + StuId +
                ", StuName='" + StuName + '\'' +
                ", StuEmail='" + StuEmail + '\'' +
                '}';
    }
}
