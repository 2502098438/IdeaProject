package jdbcTemplate.test;

import jdbcTemplate.service.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    @Test
    public void testStudent(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Service service = applicationContext.getBean("service", Service.class);
/*
        Student student = new Student();
        student.setStuId(1);
        student.setStuName("李四");
        student.setStuAge(12);
        service.add(student);
*/

/*        service.delete("1");*/


/*        Student student = new Student();
        student.setStuId(1);
        student.setStuName("张三");
        student.setStuAge(32);
        service.update(student);*/

        /*service.query();*/

/*        Student student = service.queryStudent("1");
        System.out.println(student);*/

/*        List<Student> students = service.queryAllStudent();
        System.out.println(students);*/

/*        List<Object[]> objects = new ArrayList<>();
        Object[] objects1 = {"3","王五","33"};
        Object[] objects2 = {"4","小四","32"};
        objects.add(objects1);
        objects.add(objects2);
        service.batchAdd(objects);*/

        List<Object[]> objects = new ArrayList<>();
        Object[] objects1 = {"4"};
        objects.add(objects1);
        service.batchDelete(objects);

        List<Object[]> objects2 = new ArrayList<>();
        Object[] objects12 = {"王五","33","1"};
        Object[] objects22 = {"小四","32","2"};
        objects2.add(objects12);
        objects2.add(objects22);
        service.batchUpdate(objects2);
    }
}
