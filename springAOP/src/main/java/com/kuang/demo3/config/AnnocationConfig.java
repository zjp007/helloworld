package com.kuang.demo3.config;

import com.kuang.demo3.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


// @Configuration 标识该类也会被Spring注册到容器中，因为他本身就是一个@Component(组件)
// @Configuration 代表这是一个配置类，等价于之前的bean.xml
@Configuration
@ComponentScan("com.kuang.demo3")
@Import({Config2.class})
public class AnnocationConfig {

    // @Bean 注册一个bean，等价于之前的bean标签
    // getUser 这个方法的名称，等价于之前bean标签的 id
    // 这个方法的返回值，等价于bean标签的 class 属性
    @Bean
    public User getUser(){
        return new User();
    }
}
