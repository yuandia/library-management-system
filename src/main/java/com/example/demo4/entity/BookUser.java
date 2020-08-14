package com.example.demo4.entity;

public class BookUser {
    private Integer id;
    private String bookName;
    private String userName;
    private String barrowTime;
    private String backTime;
    private Integer status;

    public Integer getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBarrowTime() {
        return barrowTime;
    }
    public void setBarrowTime(String barrowTime) {
        this.barrowTime = barrowTime;
    }

    public String getBackTime() {
        return backTime;
    }
    public void setBackTime(String backTime) {
        this.backTime = backTime;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BookUser{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", userName='" + userName + '\'' +
                ", barrowTime='" + barrowTime + '\'' +
                ", backTime='" + backTime + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}








