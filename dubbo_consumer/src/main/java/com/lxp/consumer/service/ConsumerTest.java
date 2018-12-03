package com.lxp.consumer.service;

import com.lxp.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerTest {


        public static void main(String[] args) {
            System.out.println("测试开始！");
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });

            context.start();
            DemoService demoService = (DemoService) context.getBean("demoService");

            System.out.println(demoService.sayHello("哈哈哈"));
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("测试结束！");
        }

}
