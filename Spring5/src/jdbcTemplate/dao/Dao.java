package jdbcTemplate.dao;

import jdbcTemplate.entity.Student;

import java.util.List;

public interface Dao {
    void add(Student student);

    void delete(String stuId);

    void update(Student student);

    int query();

    Student queryStudent(String stuId);

    List<Student> queryAllStudent();

    void batchAdd(List<Object[]> objects);

    void batchDelete(List<Object[]> objects);

    void batchUpdate(List<Object[]> objects);
}
