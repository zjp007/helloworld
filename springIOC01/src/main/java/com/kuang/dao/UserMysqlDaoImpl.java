package com.kuang.dao;

public class UserMysqlDaoImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Mysql获取用户");
    }
}
