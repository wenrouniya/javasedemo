package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.domian.User;
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

public class AnnotionCRUDTest  {
    private SqlSessionFactory factory;
    private SqlSession session;
    private InputStream in;
    private IUserDao userDao;

    @Before
    public void init()throws Exception{
        in=Resources.getResourceAsStream("SqlMapConfig.xml");
        factory =new SqlSessionFactoryBuilder().build(in);
        session=factory.openSession();
        userDao=session.getMapper(IUserDao.class);
    }

    @After
    public void destory()throws Exception{
        session.commit();
        session.close();
        in.close();
    }
    @Test
    public void  testSave(){
        User user =new User();
        user.setUsername("saveannotion");
        user.setAddress("西安");
        userDao.Save(user);
    }

    @Test
    public void  testUpdate(){
        User user =new User();
        user.setId(49);
        user.setUsername("update annotion");
        user.setAddress("陕西");
        user.setBirthday(new Date());
        userDao.Update(user);
    }

    @Test
    public  void  testDelete(){
        userDao.deleteUser(49);
    }

    @Test
    public void  testFindById(){
        User user =userDao.findById(48);
        System.out.println(user);
    }


    @Test
    public  void testFindByName(){

     //   List<User> users = userDao.findByName("%batis%");
        List<User> users = userDao.findByName("batis");
        for(User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void testFindCountUser(){
        int i=userDao.findTotalUser();
        System.out.println(i);
    }

    @Test
    public void testFindAll(){
        List<User> users=userDao.findAll();
        for(User user:users)
        {
            System.out.println("-------------每个用户信息----------------");
            System.out.println(user);
            System.out.println(user.getAccounts());
        }
    }

}
