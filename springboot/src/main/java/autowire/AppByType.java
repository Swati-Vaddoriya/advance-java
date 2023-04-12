package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppByType {
	public static void main(String[] args) {
		
		System.out.println("Auto wiring by type");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("BeansByType.xml");
		BasePojo bp = (BasePojo) ctx.getBean("basePojo");
		System.out.println(bp);
		
		ApplicationContext ctxFileSystem = new FileSystemXmlApplicationContext("myfiles/BeansByType.xml");
		BasePojo bp2 = (BasePojo) ctxFileSystem.getBean("basePojo");
		System.out.println(bp2);
	}
}
