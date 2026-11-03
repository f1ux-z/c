package com.ssm.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "provider-8001")
public interface FeignServer {
    @GetMapping(value = "/hello/nacos/99")
    public String getPort();
}
