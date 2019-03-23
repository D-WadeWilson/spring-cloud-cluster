package com.zhang;

import com.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.zhang"})
@ComponentScan("com.zhang")
//@RibbonClient(name = "MS-DEPT",configuration = MySelfRule.class)
public class ApplicationMain80Feign {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain80Feign.class,args);
    }
}
