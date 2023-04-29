package com.codemind.dao;

import java.util.List;

import com.codemind.model.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmployee();
	public String saveEmployee(Employee employee);
//	public String updateEmployee(String empId,Employee employee);

}
