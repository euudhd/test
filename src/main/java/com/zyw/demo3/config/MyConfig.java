package com.zyw.demo3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/*自己想配置一些Bean*/
@Configuration     //这是一个自定义的配置类
public class MyConfig {
    //配置自己的Bean
    @Bean                      //该Bean会纳入到Spring容器
    /*配置一个日期类*/
    public Date getDate(){
        return new Date();
    }

}
