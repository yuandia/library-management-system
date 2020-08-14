package com.example.demo4.service;

import com.example.demo4.entity.BookUser;
import com.example.demo4.mapper.BookUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookUserService {
    @Autowired
    private BookUserMapper bookUserMapper;

    public List<BookUser> getBookUserList(){
        return bookUserMapper.getBookUserList();
    }

    public BookUser addBookUser(String bookName,String userName,String barrowTime,String backTime,Integer status){
        return bookUserMapper.addBookUser(bookName,userName,barrowTime,backTime,status);
    }
}
