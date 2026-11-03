package com.ssm.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonServer {

    @Autowired
    RestTemplate restTemplate;

    public String hiribbon() {
        return restTemplate.getForObject
                ("http://provider-8001/hello/nacos/88",String.class);
    }
}
