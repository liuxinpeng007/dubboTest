package com.lxp.api.service;

public interface DemoService {
    /**
     * 测试dubbo可用性
     * @param name 姓名
     * @return hello,姓名
     */
    String sayHello(String name);
}
