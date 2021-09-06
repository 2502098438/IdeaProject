package transaction.test;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import transaction.service.Service;

/*@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring.xml")*/

@SpringJUnitConfig(locations = "classpath:spring.xml")
public class TestJunit5 {

    @Autowired
    private Service service;


    @Test
    public void test(){
        service.bank();
    }
}
