package com.codeming.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	public String name ="Rohan" ;
	
	@Value("${student.school}")
	public String school;
	
	
	@Autowired
	public Address address ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", school=" + school + ", address=" + address + "]";
	}
	
	


	

	

}

