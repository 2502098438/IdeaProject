package transaction.test;

import org.springframework.context.support.GenericApplicationContext;

public class TestTransaction {
/*    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Service service = applicationContext.getBean("service", Service.class);
        service.bank();
    }*/

    /*    public static void main(String[] args) {
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
            Service service = applicationContext.getBean("service", Service.class);
            service.bank();
        }*/
    public static void main(String[] args) {

        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.registerBean("user", User.class, () -> new User());
        Object user = context.getBean("user");
        System.out.println(user);
    }
}
