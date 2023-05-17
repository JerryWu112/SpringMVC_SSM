package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {


//    @Test
//    public void run1() throws Exception {
//        //加载配置文件
//        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
//        //创建SqlSessionFactory对象
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//        //创建SqlSession对象
//        SqlSession session = factory.openSession();
//        //获取代理对象
//        AccountDao dao = session.getMapper(AccountDao.class);
//        //调用方法
//        List<Account> accounts = dao.findAll();
//        for (Account account : accounts) {
//            System.out.println(account);
//        }
//        //释放资源
//        session.close();
//        is.close();
//    }
//
//    @Test
//    public void run2() throws Exception {
//        //加载配置文件
//        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
//        //创建SqlSessionFactory对象
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//        //创建SqlSession对象
//        SqlSession session = factory.openSession();
//        //获取代理对象
//        AccountDao dao = session.getMapper(AccountDao.class);
//        //调用方法
//        Account account = new Account();
//        account.setName("王五");
//        account.setMoney(400d);
//        dao.saveAccount(account);
//        //提交事务
//        session.commit();
//        //释放资源
//        session.close();
//        is.close();
//    }
}
