package com.codemind.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codemind.dao.EmployeeDAO;
import com.codemind.model.Employee;
import com.codemind.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
//	public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public List<Employee> getAllEmployee() {
		
		System.out.println("Inside Service getAllEmployee()");
		
		List<Employee> emplist = employeeDAO.getAllEmployee();
		
		//Business Logic
		
		return emplist;
	}

	@Override
	public String saveEmployee(Employee employee) {
		
		System.out.println("Inside Service saveEmployee()");
		
		return employeeDAO.saveEmployee(employee);
	}

//	@Override
//	public String updateEmployee(String empId, Employee employee) {
//		System.out.println("Inside Service updateEmployee()");
//
//		 employeeDAO.updateEmployee("1", employee);
//		 return "Updated Employee" ;
//	}
	


}
