package jdbcTemplate.service;


import jdbcTemplate.dao.impl.DaoImpl;
import jdbcTemplate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private DaoImpl dao;

    public void add(Student student) {
        dao.add(student);
    }

    public void delete(String stuId) {
        dao.delete(stuId);
    }

    public void update(Student student) {
        dao.update(student);
    }

    public int query() {
        return dao.query();
    }

    public Student queryStudent(String stuId) {
        return dao.queryStudent(stuId);
    }

    public List<Student> queryAllStudent() {
        return dao.queryAllStudent();
    }

    public void batchAdd(List<Object[]> objects) {
        dao.batchAdd(objects);
    }

    public void batchDelete(List<Object[]> objects) {
        dao.batchDelete(objects);
    }

    public void batchUpdate(List<Object[]> objects) {
        dao.batchUpdate(objects);
    }
}
