package com.codemind.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codemind.dao.EmployeeDAO;
import com.codemind.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Employee> getAllEmployee() {
		System.out.println("Inside DAO getAllEmployee()");
		List<Employee> emplist = sessionFactory.openSession().createQuery("from Employee").list();

		return emplist;
	}

	@Override
	public String saveEmployee(Employee employee) {

		System.out.println("Inside DAO saveEmployee()");

		try {

			Session session = sessionFactory.openSession();
			session.beginTransaction();

			session.saveOrUpdate(employee);

			session.getTransaction().commit();
			session.close();
			return "Employee Details saved Successfully";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error While saving employee details";
		}

	}

//	@Override
//	public String updateEmployee(String empId, Employee employee) {
//		System.out.println("Inside DAO saveEmployee()");
//
//		try {
//
//			Session session = sessionFactory.openSession();
//			session.beginTransaction();
//
//			session.update(employee);
//
//			session.getTransaction().commit();
//			session.close();
//			return "Employee Details updated Successfully";
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "Error While saving employee details";
//		}
//
//	}
}