package com.example.demo4.service;

import com.example.demo4.entity.Book;
import com.example.demo4.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService{

    @Autowired
    private BookMapper bookMapper;

    public List<Book> getList(){
        return bookMapper.getList();
    }

    public Book setBook(String bookName,String creatDate){
        return bookMapper.setBook(bookName,creatDate);
    }
}
