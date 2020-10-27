package com.kuang.demo2;

import com.kuang.demo1.UserService;
import com.kuang.demo1.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实实例
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色(类)--不存在
        ProxyInvacationHandler pix = new ProxyInvacationHandler();
        //设置要代理的对象
        pix.setTarget(userService);
        //动态生成代理类(接口)
        UserService userServiceProxy = (UserService) pix.getProxy();

        userServiceProxy.add();
        userServiceProxy.update();
        userServiceProxy.delete();
        userServiceProxy.query();
    }
}
