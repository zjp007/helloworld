package com.kuang.service;

import com.kuang.dao.UserDao;

public class UserServiceImpl  implements UserService {

    private UserDao userDao;

    //使用set方法进行动态注入值
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
