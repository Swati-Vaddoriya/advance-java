package com.codemind.service;

import java.util.List;

import com.codemind.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	
	public String saveEmployee(Employee employee);

//	public String updateEmployee(String empId,Employee employee);

}
