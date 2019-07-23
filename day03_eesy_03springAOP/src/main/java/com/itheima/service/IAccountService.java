package com.itheima.service;


/**
 * 模拟业务层接口
 */
public interface IAccountService {

    /**
     * 保存用户
     */
    void saveAccount();

    /**
     * 更新用户
     * @param i
     */
    void  updateAccount(int i);

    /**
     * 删除用户
     * @return
     */
    int deleteAccount();
}
