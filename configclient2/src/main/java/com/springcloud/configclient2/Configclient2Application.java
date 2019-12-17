package com.springcloud.configclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Configclient2Application {

    public static void main(String[] args) {
        SpringApplication.run(Configclient2Application.class, args);
    }

}
