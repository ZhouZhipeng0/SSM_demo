package service;

import dao.IAcountDao;
import dao.IAcountDaoImpl;

/**
 * @Author :13340
 * @Date :Created in 2021-07-07-23:35
 * @Description:
 **/


public class IAccountServiceImpl implements IAccountService{
    private IAcountDao iAccountDao;

    @Override
    public void saveAccount() {
        iAccountDao.saveAcount();
    }
}
