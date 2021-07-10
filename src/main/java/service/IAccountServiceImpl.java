package service;

import dao.IAcountDao;
import domain.Account;

import java.util.List;

/**
 * @Author :13340
 * @Date :Created in 2021-07-07-23:35
 * @Description:
 **/


public class IAccountServiceImpl implements IAccountService{
    private IAcountDao iAccountDao;

    public IAcountDao getiAccountDao() {
        return iAccountDao;
    }

    public void setiAccountDao(IAcountDao iAccountDao) {
        this.iAccountDao = iAccountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return iAccountDao.findAll();
    }
}
