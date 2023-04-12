package constructor;

public class Person {
	int personId;
	String name;
	School school;

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", school=" + school + "]";
	}

	public int getPersonId() {
		return personId;
	}

	public Person() {
		super();
		System.out.println("Default Person");
	}

	public Person(int personId, String name, School school) {
		super();
		System.out.println("Parameterized person");
		this.personId = personId;
		this.name = name;
		this.school = school;
	}

}
