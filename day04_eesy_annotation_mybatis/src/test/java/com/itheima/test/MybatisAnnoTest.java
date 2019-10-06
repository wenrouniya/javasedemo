package com.itheima.test;



import com.itheima.dao.IUserDao;

import com.itheima.domian.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MybatisAnnoTest {

    public  static void  main(String [] args) throws  Exception{
        //1.获取字节输入流
        //2.根据字节输入流创建SqlSessionFactory
        //3.根据SqlSessionFactory创建一个sqlsession
        //4.使用sqlsession获取dao的代理对象
        //5.执行dao的方法
        //6.释放资源
        InputStream in =Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session= factory.openSession();
        IUserDao userDao= session.getMapper(IUserDao.class);
        List<User> users=userDao.findAll();
        for(User user:users)
        {
            System.out.println(user);
        }
        session.close();
        in.close() ;

    }
}
