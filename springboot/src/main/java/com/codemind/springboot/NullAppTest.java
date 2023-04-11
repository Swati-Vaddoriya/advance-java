package com.codemind.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NullAppTest {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Beans.xml");

		System.out.println();
		Employee employee = (Employee) context.getBean("employee");
		employee = null;
		employee.employeeGreetings();
		System.out.println(employee);

		Employee emp = new Employee(121, "Swara", "Health", 100000);
		emp = null;
		emp.employeeGreetings();
		System.out.println(emp);

	}

}
