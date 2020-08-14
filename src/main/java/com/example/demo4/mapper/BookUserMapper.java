package com.example.demo4.mapper;

import com.example.demo4.entity.BookUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookUserMapper {
    List<BookUser> getBookUserList();

    BookUser addBookUser(@Param("bookName") String bookName,
                         @Param("userName") String userName,@Param("barrowTime") String barrowTime,
                         @Param("backTime") String backTime,@Param("status") Integer status);
}
