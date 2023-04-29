package com.codeming.springbootexample.deadlock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class B {
	@Autowired
	public A a;
	
	@PostConstruct
	private void postConstruct() {
		System.out.println("Post Construct called");
	}

	@PreDestroy
	private void preDesroy() {
		System.out.println("Pre destroy called");
	}
}