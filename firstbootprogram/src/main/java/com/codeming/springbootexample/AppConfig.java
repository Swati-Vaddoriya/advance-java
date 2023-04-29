package com.codeming.springbootexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	 
	 
	
	@Bean("rohan")  
	@Primary
	public Student getStudent() {
		Student st = new Student();
		st.setName("Rohan");
	
		return st;
	}
	
	
	@Bean("mohan") 
	public Student getStudent1() {
		Student st = new Student();
		st.setName("Mohan");
		return st;

	}
	
	@Bean("rajesh") 
	public Student getStudent2() {
		Student st = new Student();
		st.setName("Rajesh");
		return st;

	}
}
