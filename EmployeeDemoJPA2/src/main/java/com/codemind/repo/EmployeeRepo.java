package com.codemind.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.codemind.model.Employee;

@Repository
@Service
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
