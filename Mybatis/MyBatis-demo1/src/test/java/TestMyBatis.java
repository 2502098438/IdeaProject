import dao.StudentDao;
import entity.Employee;
import entity.Student;
import entity.Student2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import utils.SqlSessionUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestMyBatis {

    @Test
    public void testInsert() throws IOException {
/*        InputStream resource = Resources.getResourceAsStream("MyBatis.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resource);

        SqlSession sqlSession = factory.openSession();

        Student student = new Student();
        student.setId(5);
        student.setStuName("老五");
        student.setEmail("1249117412@qq.com");

        int insert = sqlSession.insert("dao.StudentDao.insertStudent", student);

        sqlSession.commit();

        System.out.println("插入影响的行数"+insert);

        sqlSession.close();*/



/*        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        List<Student> students = mapper.queryStuByNameOrId("老大", 2);
        for(Student student:students){
            System.out.println(student);
        }
        sqlSession.commit();
        sqlSession.close();*/


        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(1);
        student.setStuName("老二");
        List<Student> students = mapper.queryStuByClass(student);
        for (Student student1 : students) {
            System.out.println(student1);
        }
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testEmployee() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        List<Employee> employees = mapper.queryEmployee(1);
        System.out.println(employees);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        Map<Object, Object> map = mapper.qureyMap(1);
        System.out.println(map);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testStudent2() {
        /*此例子说明了从数据库中查资源跟大小写无关,跟属性名有关*/
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        List<Student2> student2s = mapper.queryAllStudent2();

        for (Student2 student2 : student2s) {
            System.out.println(student2);
        }

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testStudent2Success() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        List<Student2> student2s = mapper.queryStudent2Success();
        for (Student2 student2 : student2s) {
            System.out.println(student2);
        }
        sqlSession.commit();
        sqlSession.close();

    }


    @Test
    public void queryStuByIf() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        student.setStuName("老五");
        student.setEmail("2502098438@qq.com");
        List<Student> students = mapper.queryStuByIf(student);
        for (Student student1 : students) {
            System.out.println(student1);
        }
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void queryForEach() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Student> students = mapper.queryForEach(list);
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void queryForEachObj() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setId(1);
        list.add(student);

        Student student1 = new Student();
        student1.setId(3);
        list.add(student1);


        List<Student> students = mapper.queryForEachObj(list);
        for (Student student3 : students) {
            System.out.println(student3);
        }
        sqlSession.commit();
        sqlSession.close();

    }
}
