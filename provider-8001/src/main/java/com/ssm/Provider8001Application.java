package com.ssm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //开启服务发现功能
public class Provider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider8001Application.class,args);
    }
}
