package com.springcloud.consumer.controller;

import com.springcloud.consumer.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/")
public class consumer {

    @Autowired
    private ProviderService providerService;

    @Value("${hello}")
    private String config;

    @GetMapping("/config")
    public String config() {
        return config;
    }

    @GetMapping("/test")
    public String test() {
        return providerService.hello();
    }

    @GetMapping("/timeout")
    public String timeout() {
        return providerService.timeout();
    }
}
