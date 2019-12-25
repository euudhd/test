package com.zyw.demo3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@SpringBootTest
/*@ContextConfiguration(classes = Demo3Application.class)
@ExtendWith(SpringExtension.class)*/
class Demo3ApplicationTests {

    @Test
    void contextLoads() {
    }

     /*--------------------------------------------*/
    //测试MyConfig里面自己定义的bean
     //获得容器中的Bean
    @Autowired
    Date myDate;//定义Date变量

    @Test
    public void test(){
        System.out.println(myDate);
    }

    /*--------------------------------------------*/

}
