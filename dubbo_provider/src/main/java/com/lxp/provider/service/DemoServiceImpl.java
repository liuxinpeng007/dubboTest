package com.lxp.provider.service;


import com.lxp.api.service.DemoService;

public class DemoServiceImpl implements DemoService {

    // 实现DemoService接口
    public String sayHello(String name) {
        return "hello,world:" + name;
    }

}
