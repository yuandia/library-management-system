package com.example.demo4.controller;

import com.example.demo4.entity.BookUser;
import com.example.demo4.mapper.BookUserMapper;
import com.example.demo4.service.BookUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/SpringBoot")
public class BookUserController{

    @Autowired
    private BookUserService bookUserService;

    @RequestMapping("/getBookUserList")
    public List<BookUser> getBookUserList(){
        return bookUserService.getBookUserList();
    }

    @RequestMapping("/addBookUser")
    public String addBookUser(String bookName,String userName,String backTime){
        Calendar cal=Calendar.getInstance();
        String barrowTime=cal.get(cal.YEAR)+"-"+(cal.get(cal.MONTH)+1)+"-"+cal.get(cal.DAY_OF_MONTH);
        bookUserService.addBookUser(bookName,userName,barrowTime,backTime,2);
        return "借书成功，书本："+bookName+",借书时间："+barrowTime+",归还时间："+backTime;
    }
}







