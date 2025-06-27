package com.neusoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  //激活Eureka Server
@SpringBootApplication
public class MyApplication_8762 {

	public static void main(String[] args) {
		SpringApplication.run(MyApplication_8762.class, args);
	}
}