package com.lxp.provider.service;


import com.lxp.api.service.DemoService;

public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "hello," + name;
    }

}
