package dao;

import entity.Employee;
import entity.Student;
import entity.Student2;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    List<Student> queryAllStu();
    int insertStudent(Student student);
    List<Student> queryStuByNameOrId(@Param("stuName") String stuName, @Param("id") int id);
    List<Student> queryStuByClass(Student student);
    List<Employee> queryEmployee(Integer id);
    Map<Object,Object> qureyMap(Integer id);
    List<Student2> queryAllStudent2();
    List<Student2> queryStudent2Success();
    List<Student> queryStuByIf(Student student);
    List<Student> queryForEach(List<Integer> id);
    List<Student> queryForEachObj(List<Student> students);
}
