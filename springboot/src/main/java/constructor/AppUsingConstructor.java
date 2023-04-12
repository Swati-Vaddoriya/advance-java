package constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppUsingConstructor {
	public static void main(String[] args) {
		
		System.out.println("Defining beans using Constructors\n");
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansUsingConstructor.xml");
		School school = (School) context.getBean("school");
		System.out.println(school);
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("BeansUsingConstructor.xml");
		Person person = (Person) context2.getBean("person");
		System.out.println(person);
		
//		OUTPUT
//		School [number=101, name=P.P.Savani]
//		Parameterized school
//		Parameterized person
//		Person [personId=18, name=Swati, school=School [number=101, name=P.P.Savani]]
	}
}
