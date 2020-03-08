package com.atguigu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
public class ConfigCilent_3355_StartSpringCloudApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigCilent_3355_StartSpringCloudApp.class, args);
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {

		PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();

		c.setIgnoreUnresolvablePlaceholders(true);

		return c;

	}



}
