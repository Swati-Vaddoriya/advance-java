package com.codeming.springbootexample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeming.springbootexample.Student;
import com.codeming.springbootexample.entity.EmployeeRepository;
import com.codeming.springbootexample.firstbootprogram.Employee;

@RestController
@RequestMapping("/myapp")
public class EmployeeController {

	@Autowired
	@Qualifier("rajesh")
	public Student student ;
	
	
	@Autowired
	public EmployeeRepository emprepo ;

	@RequestMapping("/helloworld" )
	public  Student  sayHello() {
		
		System.out.println("Hello Pune");
		
		return student;
	}
	
	@RequestMapping("/getTotalEmployee" )
	public  Long  getTotalEmployee() {
		
		Long count = emprepo.count();
		
		System.out.println(emprepo.count());
		
		return count;
	}
	
	@RequestMapping("/getAllEmployee" )
	public  List<Employee>   getAllEmployee() {
		
	List<Employee> emplist = emprepo.findAll();
	
		
		
		
		return emplist;
	}

	@RequestMapping("/getEmployeeId" )
	public  Optional<Employee>   getEmployeeId() {
		
	Optional<Employee> emplist = emprepo.findById(12);
	
	
		
		
		return emplist;
	}
	
	
}

 	
 	
