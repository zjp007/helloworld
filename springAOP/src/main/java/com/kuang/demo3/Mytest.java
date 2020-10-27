package com.kuang.demo3;

import com.kuang.demo3.config.AnnocationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        // 完全使用配置类，只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象价值
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnocationConfig.class);
        User user = context.getBean("getUser",User.class);
        System.out.println(user.toString());
    }
}
