package com.example.demo4.entity;

public class Book {
    private Integer bookId;
    private String bookName;
    private String creatDate;

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
    public Integer getBookId() {
        return bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookName() {
        return bookName;
    }

    public void setCreatDate(String creatDate) {
        this.creatDate = creatDate;
    }

    public String getCreatDate() {
        return creatDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", creatDate='" + creatDate + '\'' +
                '}';
    }
}
















