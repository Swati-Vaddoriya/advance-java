package com.Lib_mgt_hibernate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "lib_stud")
public class Student {

	public String name = "";
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String bookIssued;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookIssued() {
		return bookIssued;
	}

	public void setBookIssued(String bookIssued) {
		this.bookIssued = bookIssued;
	}

}
