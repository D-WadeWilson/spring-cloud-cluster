package com.zhang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain80.class,args);
    }
}
