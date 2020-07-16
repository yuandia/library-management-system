package com.example.demo4.service;

import com.example.demo4.entity.User;
import com.example.demo4.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getList(){
        return userMapper.getList();
    }

    public User getUser(String username){
        return userMapper.getUser(username);
    }

    public User addList(String userName, String account,String password){
        return userMapper.addList(userName,account,password);
    }

    public String delete(String username){
        return userMapper.delete(username);
    }

    public User update(String userName, String account,String password){
        return userMapper.update(userName,account,password);
    }
}
