package com.codemind.springboot;

public class Employee {
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ "]";
	}
	
//	public void employeeGreetings(){
		public static void employeeGreetings(){
		System.out.println("Employee Greetings..!");
	}

	public Employee() {
		super();
	}

	public Employee(int empId, String name, String department, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	int empId;
	String name;
	String department;
	int salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
