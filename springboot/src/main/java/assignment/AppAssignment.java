package assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAssignment {
	public static void main(String[] args) {
		
		System.out.println("Using constructor for Dependency Injection");
	
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansConstructorAssignment.xml");
		Department dep = (Department) context.getBean("department");
		System.out.println(dep);
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("BeansConstructorAssignment.xml");
		Employee emp = (Employee) context2.getBean("employee");
		System.out.println(emp);
//		<bean id="employee" class="assignment.Employee">
//		<property name="empId" value="786" />
//		<property name="name" value="Swati Vaddoriya" />
//		<property name="department" ref="department" />
//		<property name="salary" value="60000" />
//	</bean>
	}
}
