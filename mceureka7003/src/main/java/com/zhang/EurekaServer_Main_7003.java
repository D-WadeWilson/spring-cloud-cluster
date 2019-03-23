package com.zhang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //eureka 服务端
@SpringBootApplication
public class EurekaServer_Main_7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_Main_7003.class,args);
    }
}
