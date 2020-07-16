package com.example.demo4.mapper;

import com.example.demo4.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper{
    public List<Book> getList();

    public Book setBook(@Param("bookName") String bookName,@Param("creatDate") String creatDate);
}