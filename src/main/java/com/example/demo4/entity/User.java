package com.example.demo4.entity;

public class User {
    private Integer userid;
    private String username;
    private String account;
    private String password;

    public Integer getUserid(){
        return userid;
    }

    public void setUserid(Integer userid){
        this.userid=userid;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account){
        this.account=account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + userid +
                ", userName='" + username + '\'' +
                ", passWord='" + account + '\'' +
                ", realName='" + password + '\'' +
                '}';
    }
}


















