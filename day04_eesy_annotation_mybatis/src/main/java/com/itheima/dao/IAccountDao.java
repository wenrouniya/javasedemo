package com.itheima.dao;

import com.itheima.domian.Account;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface IAccountDao {

    /**
     * 查询所有方法
     * @return
     */
    @Select("select * from account")
    @Results(id = "accountMap", value = {
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "uid",column = "uid"),
            @Result(column = "money",property = "money"),
            @Result(column = "uid",property = "user",one = @One( select = "com.itheima.dao.IUserDao.findById",fetchType = FetchType.EAGER))
    })
    List<Account> findAll();


    /**
     * 根据id查询账户信息
     * @param id
     * @return
     */
    @Select("select * from account where uid=#{id}")
    List<Account> findById(Integer id);
}
