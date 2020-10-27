package com.kuang.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//自动生成动态代理类
public class ProxyInvacationHandler implements InvocationHandler{

    //被代理的接口(被代理的 真实角色)
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到 代理类（接口）
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    //处理 代理类 实例，并返回结果
    //代理类 所有调用 真实角色 的方法都是执行此invoke方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //输出日志
        log(method.getName());
        //最终都是调用此方法来执行，反射机制
        Object result = method.invoke(target,args);
        return result;
    }

    public void log(String msg){
        System.out.println("调用" + msg + "方法");
    }
}
