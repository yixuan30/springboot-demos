package com.shitou.mybatis.mapper;

import com.shitou.mybatis.bean.User2;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by qcl on 2019-07-19
 * 微信：2501902696
 * desc: 通过编写sql语句来管理数据库
 */
@Mapper
public interface User2Mapper {
    @Insert("insert into user2(name, age) values(#{name}, #{age})")
    int add(@Param("name") String name, @Param("age") int age);

    @Update("update user2 set name = #{name}, age = #{age} where id = #{id}")
    int update(@Param("name") String name, @Param("age") int age, @Param("id") int id);

    @Delete("delete from user2 where id = #{id}")
    int delete(int id);

    @Select("select id, name as name, age as age from user2 where id = #{id}")
    User2 findOne(@Param("id") int id);

    @Select("select * from user2")
    List<User2> findAll();
}
