package transaction.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import transaction.dao.Dao;

@org.springframework.stereotype.Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class Service {

    @Autowired
    private Dao dao;

    public void bank(){
        dao.reduceMoney();

/*        int i=10/0;*/

        dao.addMoney();
    }
}
