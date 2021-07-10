package service;

import dao.IAcountDao;
import domain.Account;

import java.util.List;

/**
 * @Author :13340
 * @Date :Created in 2021-07-07-23:34
 * @Description:
 **/

public interface IAccountService {
    public List<Account> findAllAccount();
}
