package constructor;

import com.codemind.springboot.Address;

public class Person {
	public int personId;
	public String name;
	public School school;
	public Address address;

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", school=" + school+ ", address=" + address + "]";
	}

	public int getPersonId() {
		return personId;
	}

//	public Person() {
//		super();
//		System.out.println("Default Person");
//	}

	public Person(String name,int personId,  School school, Address address) {
		super();
		System.out.println("Parameterized person");
		this.personId = personId;
		this.name = name;
		this.school = school;
		this.address = address;
	}

}
