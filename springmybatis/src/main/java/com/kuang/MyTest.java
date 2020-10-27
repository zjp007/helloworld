package com.kuang;

import com.kuang.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        StudentDao userMapper = context.getBean("studenMapper", StudentDao.class);
        userMapper.selectStudent();
    }
}
