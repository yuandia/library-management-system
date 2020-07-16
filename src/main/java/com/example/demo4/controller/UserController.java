package com.example.demo4.controller;

import com.example.demo4.entity.User;
import com.example.demo4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/SpringBoot")
public class UserController{

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserList")/*获取所有人账号信息*/
    public List<User> getList(){
        List<User> userlist=userService.getList();
        return userlist;
    }

    @RequestMapping("/getUser")/*获取某个人账号信息*/
    public User getUser(String username){
        return userService.getUser(username);
    }

    @RequestMapping("/addList")/*注册账号*/
    public User addList(String userName, String account,String password){
        return userService.addList(userName,account,password);
    }

    @RequestMapping("/delete")/*注销账号*/
    public String delete(String username){
        userService.delete(username);
        return  "注销成功";
    }

    @RequestMapping("/update")/*更换新账号*/
    public String update(String userName, String account,String password){
        userService.update(userName,account,password);
        return "修改成功，新账号："+account+"，新密码："+password;
    }
}











