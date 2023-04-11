package com.codemind.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Beans.xml");

		System.out.println();
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

	}

}
