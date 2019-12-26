package com.springcloud.consumer.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ConsumerFeignFallbackFactory implements FallbackFactory<ProviderService> {
    @Override
    public ProviderService create(Throwable throwable) {
        return new ProviderService() {
            @Override
            public String hello() {
                return "服务不可用";
            }

            @Override
            public String timeout() {
                return "服务超时";
            }
        };
    }
}
