package com.lckiss.mapper;

import com.lckiss.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Insert("insert into user(name) values(#{name})")
    void insertUser(@Param("name") String name);

    @Select("select * from user where id=#{id}")
    User selectUserById(@Param("id") Integer id);
}
