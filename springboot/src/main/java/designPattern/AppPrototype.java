package designPattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppPrototype {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("BeansDesignPattern.xml");
		
		System.out.println("PROTOTYPE DESIGN PATTERN\n");
		
		User user1 = (User) ctx.getBean("userPrototype");
		User user2 = (User) ctx.getBean("userPrototype");
		User user3 = (User) ctx.getBean("userPrototype");
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println();
		
		System.out.println("Is user1 instance of User? : " + (user1 instanceof User));
		System.out.println("Is user2 instance of User? : " + (user2 instanceof User));
		System.out.println("Is user3 instance of User? : " + (user3 instanceof User));
	}
}
