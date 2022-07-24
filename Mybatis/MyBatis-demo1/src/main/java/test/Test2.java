package test;

import com.github.pagehelper.PageHelper;
import entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import utils.SqlSessionUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws IOException {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        PageHelper.startPage(2, 3);
        List<Student> students = sqlSession.selectList("dao.StudentDao.queryAllStu");

        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
