package com.springcloud.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "provider", fallbackFactory = ConsumerFeignFallbackFactory.class)
public interface ProviderService {

    @RequestMapping("/hello")
    String hello();

    @GetMapping("/timeout")
    String timeout();

}
