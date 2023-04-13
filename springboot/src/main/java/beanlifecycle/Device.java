package beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Device implements InitializingBean, DisposableBean {
	public String name;

	@Override
	public String toString() {
		return "Device [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("1. afterPropertiesSet Init called - InitializingBean ");

	}

	public void customInit() {
		System.out.println("2. custom Init method called using xml file.");
	}

	public void destroy() throws Exception {
		// Server tells the spring to destroy the bean
		// Telling that server is going to shut down
		
		System.out.println("4. destroy method called - DisposableBean");
	}
	
	public void customDestroy() {
		System.out.println("5. Custom destroy method called - using destroy-method");
	}

}
