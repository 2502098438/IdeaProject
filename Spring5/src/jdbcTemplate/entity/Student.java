package jdbcTemplate.entity;

public class Student {
    private int stuId;
    private String StuName;
    private int stuAge;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", StuName='" + StuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}
