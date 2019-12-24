package com.springcloud.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hystrix {
    @RequestMapping("/defaultfallback")
    public String defaultfallback() {
        return "服务降级";
    }
}
