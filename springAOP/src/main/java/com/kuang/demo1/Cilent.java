package com.kuang.demo1;

public class Cilent {
    public static void main(String[] args) {
        //1. 原始调用
//        UserService userService = new UserServiceImpl();
//        userService.add();
        //代理模式
        //保证不改变源代码，扩展新功能
        UserService userService_AOP = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService_AOP);
        userServiceProxy.add();
    }
}
