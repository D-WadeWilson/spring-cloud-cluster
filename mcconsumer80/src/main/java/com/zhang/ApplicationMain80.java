package com.zhang;

import com.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MS-DEPT",configuration = MySelfRule.class)
public class ApplicationMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain80.class,args);
    }
}
