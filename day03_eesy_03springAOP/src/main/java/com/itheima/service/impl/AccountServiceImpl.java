package com.itheima.service.impl;

import com.itheima.service.IAccountService;
public class AccountServiceImpl implements IAccountService {
    public void saveAccount() {
        System.out.println("执行了保存操作");
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新操作"+i);
    }

    public int deleteAccount() {
        System.out.println("执行了删除操作");
        return 0;
    }
}



