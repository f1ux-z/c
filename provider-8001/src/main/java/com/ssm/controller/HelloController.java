package com.ssm.controller;


import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/hello/nacos/{id}")
    public String getPayment(@PathVariable("id")Integer id){

        return "服务名：provider-8001"+"<br/>端口号："+serverPort+"<br/>传入的参数："+id;
    }


}
