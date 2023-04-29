package com.codemind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.codemind.model.Employee;
import com.codemind.service.EmployeeService;
import com.codemind.serviceImpl.EmployeeServiceImpl;




@Controller
public class EmployeeController {
	
	//EmployeeService emp = new EmployeeServiceImpl();
	
	@Autowired
	private EmployeeService employeeService ;  
	
		
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> getAllEmployee(ModelAndView mv) {
		
		System.out.println("In Controller getAllEmployee() method");
		
		List<Employee> emplist = employeeService.getAllEmployee(); 
		
		mv.addObject("employeeList", emplist);
		//mv.setViewName("main");
		
		return emplist;
		
	}
	
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	@ResponseBody
	public String saveEmployee(@RequestBody Employee employee) {
		
		System.out.println("In Controller saveEmployee() method");
		
		System.out.println(employee);
		
		return employeeService.saveEmployee(employee);
		
	}
	
//	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT)
//	@ResponseBody
//	public String updateEmployee(@RequestBody Employee employee) {
//		
//		System.out.println("In Controller saveEmployee() method");
//		
//		System.out.println(employee);
//		
//		return employeeService.updateEmployee("1", employee);
//		
//	}
	
}
