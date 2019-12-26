package com.bryan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.bryan.mapper")
@SpringBootApplication
public class SpringBootWeb01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWeb01Application.class, args);
	}

}
