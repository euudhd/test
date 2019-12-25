package com.zyw.demo3.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /*用Spring的注解Value注解*/
    @Value("${app.msg}")
    private String msg;/*希望在Controller在执行之前，将配置中的常量注入给属性msg*/

    @GetMapping("/testJson")
    public String testJson(){
        return "Hello SringBoot!";

    }


    /*@GetMapping("/")
    public String testJson1(){
        return msg;

    }*/

    /*--------------------------------------------*/
    //测试处理异常MyControllerAdvice
    @RequestMapping("/")
    public String test1(){
        if(true){
            throw new RuntimeException("异常测试");
        }

        return "index";
    }
    /*--------------------------------------------*/
}
