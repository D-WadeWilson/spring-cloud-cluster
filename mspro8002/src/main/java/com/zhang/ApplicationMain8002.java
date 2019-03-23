package com.zhang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient //服务启动后自动注册到eureka服务中
public class ApplicationMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain8002.class,args);
    }
}
