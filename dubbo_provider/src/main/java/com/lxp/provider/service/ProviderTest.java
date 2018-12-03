package com.lxp.provider.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 测试类
 */
public class ProviderTest {

    public static void main(String[] args) {
        System.out.println("测试开始！");
        // 启动Spring并发布dubbo服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();
        // 发布成功标识
        System.out.println("Dubbo provider start...");
        // 等待调用
        try {
            System.in.read();   // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("测试结束！");
    }
}
