package jdbcTemplate.dao.impl;

import jdbcTemplate.dao.Dao;
import jdbcTemplate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoImpl implements Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Student student) {

        String sql = "insert into student values(?,?,?)";
        Object[] obj = {student.getStuId(), student.getStuName(), student.getStuAge()};
        int update = jdbcTemplate.update(sql, obj);
        System.out.println(update);
    }

    @Override
    public void delete(String stuId) {
        String sql = "delete from student where stuno=?";
        int update = jdbcTemplate.update(sql, stuId);
        System.out.println(update);
    }

    @Override
    public void update(Student student) {

        String sql = "update student set stuname=?,stuage=? where stuno=?";
        Object[] obj = {student.getStuName(), student.getStuAge(), student.getStuId()};
        int update = jdbcTemplate.update(sql, obj);
        System.out.println(update);

    }

    @Override
    public int query() {
        String sql = "select count(*) from student";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
        return integer;
    }

    @Override
    public Student queryStudent(String stuId) {
        String sql = "select * from student where stuno=?";
        Student student = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Student>(Student.class), stuId);
        return student;
    }

    @Override
    public List<Student> queryAllStudent() {
        String sql = "select * from student";
        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        return studentList;
    }

    @Override
    public void batchAdd(List<Object[]> objects) {
        String sql = "insert into student values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, objects);
        System.out.println(ints.length);
    }

    @Override
    public void batchDelete(List<Object[]> objects) {
        String sql = "delete from student where stuno=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, objects);
        System.out.println(ints.length);
    }

    @Override
    public void batchUpdate(List<Object[]> objects) {

        String sql = "update student set stuname=?,stuage=? where stuno=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, objects);
        System.out.println(ints.length);
    }
}

