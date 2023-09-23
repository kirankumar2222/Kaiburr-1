package com.Kiran.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@SpringBootApplication
@Configuration
//@ComponentScan(basePackages = "com.Kiran.demo.Repository")


public class KiranApplication{

	public static void main(String[] args) {
		SpringApplication.run(KiranApplication.class, args);

	}

}
