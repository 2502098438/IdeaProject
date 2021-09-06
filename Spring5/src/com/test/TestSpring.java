package com.test;

import com.aop.Book;
import com.aop.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
/*    @Test
    public void testAdd(){
        BeanFactory context = new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }*/

/*    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Book book = context.getBean("book", Book.class);
        book.testBook();
    }*/

/*    @Test
    public void testOrders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Orders orders= context.getBean("orders", Orders.class);
        orders.testOrders();
    }*/

/*    @Test
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.userService();
    }*/

/*    @Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Employ employ = context.getBean("employ", Employ.class);
        employ.employ();
    }*/

/*    @Test
    public void tesStu(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.stu();
    }*/

/*
    @Test
    public void tesBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Book book = context.getBean("book",Book.class);
        System.out.println(book.toString());
    }
*/

/*    @Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Courses courses = context.getBean("bean",Courses.class);
        System.out.println(courses.toString());

    }*/

/*    @Test
    public void tesBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Book book1 = context.getBean("book",Book.class);
        Book book2 = context.getBean("book",Book.class);
        System.out.println(book1);
        System.out.println(book2);
    }*/

/*    @Test
    public void testStudent() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println("第四步,获取bean的实例对象");
        System.out.println(student);
        //手动销毁bean
        context.close();

    }*/

/*    @Test
    public void testAutowire() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.toString());
    }*/

/*    @Test
    public void testService() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Service service = context.getBean("service", Service.class);
        System.out.println(service);
        service.service();
    }*/

/*    @Test
    public void testService() {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.annotation.AnnotationConfig.class);
        Service service = context.getBean("service", Service.class);
        System.out.println(service);
        service.service();
    }*/

/*    @Test
    public void testAop() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("user",User.class);
        user.add();
    }*/

    @Test
    public void testBookProxy() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Book book = context.getBean("book", Book.class);
        book.book();
    }
}
