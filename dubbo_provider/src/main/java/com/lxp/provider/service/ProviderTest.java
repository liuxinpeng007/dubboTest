package com.lxp.provider.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderTest {

    public static void main(String[] args) {
        System.out.println("测试开始！");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();

        System.out.println("Dubbo provider start...");

        try {
            System.in.read();   // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("测试结束！");
    }
}
