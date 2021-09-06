package test;

import entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {

        InputStream resource = Resources.getResourceAsStream("MyBatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = factory.openSession();
        List<Student> students = sqlSession.selectList("dao.StudentDao.queryAllStu");
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
