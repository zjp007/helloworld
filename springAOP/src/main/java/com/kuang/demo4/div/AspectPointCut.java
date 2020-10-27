package com.kuang.demo4.div;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect //标注这个类是一个切面
public class AspectPointCut {

    @Before("execution(* com.kuang.demo4.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("[注解]==方法执行前==");
    }

    @After("execution(* com.kuang.demo4.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("[注解]==方法执行后==");
    }

    //在环绕增强中，可以给定一个参数，代表获取处理的切入点
    @Around("execution(* com.kuang.demo4.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("[注解]==环绕前==");
        Signature signature = jp.getSignature();    //获得签名
        System.out.println("signature : " + signature);
        Object proceed = jp.proceed();
        System.out.println("返回值 : " + proceed);
        System.out.println("[注解]==环绕后==");
    }
}
