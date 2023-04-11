package com.codemind.springboot;

public class Person {
	int personId;
	String name;

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + "]";
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public Person() {
		super();
	}

	public Person(int personId, String name) {
		super();
		this.personId = personId;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
