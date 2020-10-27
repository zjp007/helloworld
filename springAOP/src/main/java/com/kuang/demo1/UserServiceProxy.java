package com.kuang.demo1;

public class UserServiceProxy {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add(){
        printMsg("增加");
        userService.add();
    }

    public void delete(){
        printMsg("删除");
        userService.delete();
    }

    public void update(){
        printMsg("更新");
        userService.update();
    }

    public void query(){
        printMsg("查询");
        userService.query();
    }

    public void printMsg(String msg){
        System.out.println("[debug] " + msg + "一个客户");
    }
}
