package com.codemind.springboot;

public class Student {
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", address=" + address + "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Student() {
	}

	public Student(int studentId, String name, Address address) {
		this.studentId = studentId;
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int studentId;
	public String name;
	public Address address;

}
