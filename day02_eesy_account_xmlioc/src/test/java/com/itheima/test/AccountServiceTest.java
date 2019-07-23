package com.itheima.test;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 使用junit单元测试  测试我们的配置
 */
public class AccountServiceTest {

    @Test
    public void testFindAll() {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.得到业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        //3.执行方法
        List<Account> accounts = as.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

        @Test
         public void testFindById(){
            //1.获取容器
            ApplicationContext  ac=new ClassPathXmlApplicationContext("bean.xml");
            //2.得到业务层对象
            IAccountService as= ac.getBean("accountService",IAccountService.class);
            //3.执行方法
           Account account=as.findAccountById(1);
            System.out.println(account);
            }

            @Test
            public void  testSaveAccount(){

            Account account=new Account();
            account.setName("testName");
            account.setMoney(4800);
           //1.获取容器
                ApplicationContext  ac=new ClassPathXmlApplicationContext("bean.xml");
                //2.获取业务层方法
                IAccountService as=ac.getBean("accountService",IAccountService.class);
                //3.执行方法
                as.saveAccount(account);

            }










        }

