package com.ssm.controller;

import com.ssm.server.RibbonServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    RibbonServer ribbonServer;

    @RequestMapping("/hiribbon")
    public String hiribbon(){
        return ribbonServer.hiribbon();
    }
}
