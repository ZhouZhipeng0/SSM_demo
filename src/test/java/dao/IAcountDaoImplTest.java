package dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IAccountService;

import static org.junit.Assert.*;

/**
 * @Author :13340
 * @Date :Created in 2021-07-08-0:36
 * @Description:
 **/

public class IAcountDaoImplTest {
    @Test
    public void test1(){
        //1.使用ApplicationContext接口，就是在获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据bean的id获取对象
        IAccountService aService = (IAccountService) ac.getBean("accountService");
        System.out.println(aService);
        IAcountDao aDao = (IAcountDao) ac.getBean("accountDao");
        System.out.println(aDao);
    }

}