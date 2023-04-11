package com.codemind.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCollection {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		PrimitiveTypesPojo coll = (PrimitiveTypesPojo) context.getBean("collection");
		System.out.println(coll);
		
		// output : PrimitiveTypesPojo [list=[10, 20, 30, 40], set=[10, 20, 30], map={name=Swati, course=Java}]

	}
}
