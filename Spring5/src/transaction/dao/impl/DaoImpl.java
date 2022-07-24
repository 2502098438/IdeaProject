package transaction.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import transaction.dao.Dao;

@Repository
public class DaoImpl implements Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void reduceMoney() {
        String sql = "update bank set money=money-? where name=?";
        jdbcTemplate.update(sql, "100", "老大");
    }

    @Override
    public void addMoney() {
        String sql = "update bank set money=money+? where name=?";
        jdbcTemplate.update(sql, "100", "老二");
    }


}
