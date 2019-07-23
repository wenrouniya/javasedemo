package com.itheima.ui;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    private static IAccountDao adao;

    /**
     * 获取spring的Ioc核心对象 并根据id获取对象
     * @param args
     */

    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取bean对象
        IAccountService as=(IAccountService)ac.getBean("aaa");

        System.out.println(as);

    }


    }

