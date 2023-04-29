package com.codeming.springbootexample.firstbootprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan( basePackages = {"com.codeming.springbootexample",
		"com.codeming.springbootexample.controller",
		"com.codeming.springbootexample.entity",
		"com.codeming.springbootexample.firstbootprogram"
		})
@EnableAutoConfiguration
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.codeming.springbootexample"}) 

@EnableJpaRepositories("com.codeming.springbootexample.entity")
public class MainApplication   {  
	 
	 
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		
	}

}

