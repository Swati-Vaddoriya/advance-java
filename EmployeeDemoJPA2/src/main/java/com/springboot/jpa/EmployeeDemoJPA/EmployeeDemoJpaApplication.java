package com.springboot.jpa.EmployeeDemoJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//exclude = {DataSourceAutoConfiguration.class },

@ComponentScan(basePackageClasses = {
		com.codemind.controller.EmployeeController.class,
		com.codemind.dao.EmployeeDAO.class,
		com.codemind.daoImpl.EmployeeDAOImpl.class,
		com.codemind.model.Employee.class,
		com.codemind.repo.EmployeeRepo.class,
		com.codemind.service.EmployeeService.class,
		com.codemind.serviceImpl.EmployeeServiceImpl.class
		})
@EnableJpaRepositories("com.springboot.jpa.entity")
public class EmployeeDemoJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDemoJpaApplication.class, args);
	}

}
