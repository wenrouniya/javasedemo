package com.itheima.dao;

import com.itheima.domian.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有
     * @return
     */

    @Select("select * from user")
    @Results(id = "userMap",value = {
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "username",column = "username"),
            @Result(property = "address",column = "address"),
            @Result(property="sex",column = "sex"),
            @Result(property = "accounts",column = "id",
                    many = @Many(select = "com.itheima.dao.IAccountDao.findById",
                            fetchType = FetchType.LAZY))
    })
    List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    @Insert("insert into user(username,sex,address,birthday)values(#{username},#{sex},#{address},#{birthday}) ")
    void Save(User user);

    /**
     * 更新用户
     * @param user
     */
    @Update("update  user set username=#{username},birthday=#{birthday},sex=#{sex},address=#{address} where id=#{id}")
    void Update(User  user);

    /**
     * 删除操作
     * @param uid
     */
    @Delete("delete from user where id=#{id}")
    void deleteUser(Integer uid);

    /**
     * 根据id查询用户
     *
     */
    @Select("select * from user where id=#{id}")
    User findById(Integer id);


    /**
     * 根据姓名模糊查询
     * @param username
     * @return
     */
//    @Select("select * from user where username like #{username}")
    @Select("select * from user where username like '%${value}%'")
    List<User> findByName(String username);

    /**
     * 查询总数
     * @return
     */
  @Select("select count(*)from user" )
  int findTotalUser();

}
