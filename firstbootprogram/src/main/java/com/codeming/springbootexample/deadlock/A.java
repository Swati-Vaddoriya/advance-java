package com.codeming.springbootexample.deadlock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class A {
	@Autowired
	@Lazy
	public B b;

}
