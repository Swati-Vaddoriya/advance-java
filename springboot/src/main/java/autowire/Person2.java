package autowire;

public class Person2 {
	public int personId;
	public String name;
	public School2 school;

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", school=" + school + "]";
	}

	public int getPersonId() {
		return personId;
	}

//	public Person() {
//		super();
//		System.out.println("Default Person");
//	}

	public Person2(int personId, String name, School2 school) {
		super();
		System.out.println("Parameterized person");
		this.personId = personId;
		this.name = name;
		this.school = school;
	}

}
