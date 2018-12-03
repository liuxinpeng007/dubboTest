package com.lxp.consumer.service;

import com.lxp.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerTest {


        public static void main(String[] args) {
            // 测试开始
            System.out.println("测试开始！");
            // 启动Spring
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });
            context.start();
            // 获取dubbo上的服务名称
            DemoService demoService = (DemoService) context.getBean("demoService");
            // 调用，并输出结果
            System.out.println(demoService.sayHello("刘新鹏测试一下下"));
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 测试结束
            System.out.println("测试结束！");
        }

}
