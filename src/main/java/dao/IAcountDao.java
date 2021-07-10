package dao;

import domain.Account;

import java.util.List;

/**
 * @Author :13340
 * @Date :Created in 2021-07-07-23:42
 * @Description:
 **/

public interface IAcountDao {
    public List<Account> findAll();
}
