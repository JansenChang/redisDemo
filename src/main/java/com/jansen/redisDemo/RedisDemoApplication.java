package com.jansen.redisDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jansen.redisDemo.dao", "com.jansen.redisDemo.controller", "com.jansen.redisDemo.dao","com.jansen.redisDemo.service"})
@MapperScan("com.jansen.redisDemo.dao")
public class RedisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisDemoApplication.class, args);
	}
}
