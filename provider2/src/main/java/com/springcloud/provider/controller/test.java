package com.springcloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class test {

    @RequestMapping("/hello")
    public String hello() {
        return "hello provider-03";
    }

    @Value("${hello}")
    private String hello;

    @GetMapping("/config")
    public String config() {
        return hello;
    }
}
