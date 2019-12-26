package com.springcloud.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class test {

    @RequestMapping("/hello")
    public String hello() {
        return "hello provider-02";
    }

    @GetMapping("/timeout")
    public String timeout() {
        return "provider01-timeout";
    }
}
