package com.codemind.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppUsingConstructor {
	public static void main(String[] args) {
		
		System.out.println("Defining beans using Constructors\n");
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansUsingConstructor.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);

	}
}
