package com.codemind.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//		Address address = new Address(18, "River Heaven", "Surat");
//		Student student = new Student(10, "Swati", address);
//		System.out.println(student);
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Address address = (Address) context.getBean("address");
		System.out.println(address);

		Student student = (Student) context.getBean("student");
		System.out.println(student);

	}

}
