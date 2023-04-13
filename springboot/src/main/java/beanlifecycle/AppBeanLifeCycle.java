package beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBeanLifeCycle {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("BeansLifeCycle.xml");

		System.out.println("3. Using bean");

		Device device = (Device) ctx.getBean("device");
		System.out.println(device);
		
		// calling destroy method of DisposableBean Interface
		((AbstractApplicationContext) ctx).registerShutdownHook();
	}

}
