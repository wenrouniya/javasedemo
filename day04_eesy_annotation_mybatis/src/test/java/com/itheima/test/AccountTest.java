package com.itheima.test;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.IUserDao;
import com.itheima.domian.Account;
import com.itheima.domian.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class AccountTest {
    private SqlSessionFactory factory;
    private SqlSession session;
    private InputStream in;
    private IAccountDao accountDao;

    @Before
    public void init()throws Exception{
        in=Resources.getResourceAsStream("SqlMapConfig.xml");
        factory =new SqlSessionFactoryBuilder().build(in);
        session=factory.openSession();
        accountDao=session.getMapper(IAccountDao.class);
    }

    @After
    public void destory()throws Exception{
        session.commit();
        session.close();
        in.close();
    }

    @Test
    public void  findAll(){
        List<Account> accounts= accountDao.findAll();
        for (Account account :accounts) {
            System.out.println("-----------------每个账户信息------------------------");
            System.out.println(account);
            System.out.println(account.getUser());
        }
    }







}
