package com.example.demo4.controller;

import com.example.demo4.entity.Book;
import com.example.demo4.service.BookService;
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
public class BookController{

    @Autowired
    private BookService bookService;

    @RequestMapping("/getBookList")
    public List<Book> getList(){
        return bookService.getList();
    }

    @RequestMapping("/setBook")
    public String setBook(String bookName){
        Calendar cal=Calendar.getInstance();
        String creatDate=cal.get(cal.YEAR)+"-"+(cal.get(cal.MONTH)+1)+"-"+cal.get(cal.DAY_OF_MONTH);
        bookService.setBook(bookName,creatDate);
        return "书本添加成功，书本名称："+bookName+"，加入日期"+creatDate;
    }
}
















