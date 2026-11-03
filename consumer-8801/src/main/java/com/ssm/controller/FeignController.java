package com.ssm.controller;

import com.ssm.server.FeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignServer feignServer;

    @GetMapping("/hifeign")
    public String hifeign(){
        return feignServer.getPort();
    }
}
