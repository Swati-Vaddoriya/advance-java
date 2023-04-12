package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import constructor.Person;
import constructor.School;

public class AppUsingAutoWire {
	public static void main(String[] args) {
		
		System.out.println("Defining beans using Auto Wiring\n");
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansUsingAutoWire.xml");
		School2 school = (School2) context.getBean("school");
		System.out.println(school);
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("BeansUsingAutoWire.xml");
		Person2 person = (Person2) context2.getBean("person");
		System.out.println(person);
		
//		OUTPUT
//		School [number=101, name=P.P.Savani]
//		Person [personId=18, name=Swati, school=School [number=101, name=P.P.Savani]]
	}
}
