package designPattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSingleton {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("BeansDesignPattern.xml");
		
		System.out.println("SINGLETON DESIGN PATTERN\n");
		
		User user1 = (User) ctx.getBean("userSingleton");
		User user2 = (User) ctx.getBean("userSingleton");
		User user3 = (User) ctx.getBean("userSingleton");
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println();
		
		System.out.println("Is user1 instance of User? : " + (user1 instanceof User));
		System.out.println("Is user2 instance of User? : " + (user2 instanceof User));
		System.out.println("Is user3 instance of User? : " + (user3 instanceof User));
	}
}
