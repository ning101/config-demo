package com.springcloud.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class test {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/timeout")
    public String timeOut() {
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "timeout";
    }
}
