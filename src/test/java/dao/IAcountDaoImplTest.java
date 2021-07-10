package dao;

import domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IAccountService;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author :13340
 * @Date :Created in 2021-07-08-0:36
 * @Description:
 **/

public class IAcountDaoImplTest {
    @Test
    public void test1(){
    //1.读取配置文件
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.创建SqlSessionFactory的构建者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //3.使用构建者创建工厂对象SqlSessionFactory
        SqlSessionFactory factory = builder.build(in);
        //4.使用SqlSessionFactory生产SqlSession对象
        SqlSession session = factory.openSession();
        //5.使用SqlSession创建dao接口的代理对象
        IAcountDao userDao = session.getMapper(IAcountDao.class);
        //6.使用代理对象执行查询所有方法
        List<Account> accounts = userDao.findAll();
        for(Account account : accounts) {
            System.out.println(account);
        }
        //7.释放资源
         session.close();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}