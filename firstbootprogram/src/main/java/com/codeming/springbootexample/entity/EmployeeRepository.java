package com.codeming.springbootexample.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeming.springbootexample.Product;
import com.codeming.springbootexample.firstbootprogram.Employee;


@Repository 
	public interface EmployeeRepository extends  JpaRepository<Employee,Integer> {
	
		
}
