package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/**
 *
 */
public interface IAccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();


    /**
     * 查询一个
     * @param id
     * @return
     */
    Account findAccountById(Integer id);

    /**
     * 保存操作
     * @param account
     */
    void  saveAccount(Account account );

    /**
     * 更新操作
     * @param account
     */
    void updateAccount(Account  account);

    /**
     * 删除操作
     * @param id
     */
    void  deleteById(Integer id);






}
