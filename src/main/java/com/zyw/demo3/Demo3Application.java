package com.zyw.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//项目的启动类
@SpringBootApplication
/*
该注解包含3个重要的注解
  1、@SpringBootConfiguration   ：继承了@Configuration（此注解用来注解配置类）   代替xml,   将Bean注入Spring容器
提出问题：如果我想创建一个Bean,没有Web-xml了，怎么创建？
回答：Bean标签
 2、
*/

public class Demo3Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);
    }

}
