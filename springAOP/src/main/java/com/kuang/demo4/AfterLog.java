package com.kuang.demo4;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice{
    // returnVale：方法返回值
    @Override
    public void afterReturning(Object returnVale, Method method, Object[] args, Object targer) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法，返回结果为：" + returnVale);
    }
}
