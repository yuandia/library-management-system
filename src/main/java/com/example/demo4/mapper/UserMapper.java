package com.example.demo4.mapper;

import com.example.demo4.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper{

    List<User> getList();

    User getUser(@Param("username") String username);

    User addList(@Param("username") String username,@Param("account") String account, @Param("password")String password);

    String delete(@Param("username") String username);

    User update(@Param("username") String username,@Param("account") String account, @Param("password")String password);
}