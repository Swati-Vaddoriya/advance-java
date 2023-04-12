package constructor;

public class School {
	public School() {
		System.out.println("Default school");

	}

	@Override
	public String toString() {
		return "School [number=" + number + ", name=" + name + "]";
	}


	int number;
	String name;

	public School(int number, String name) {
		System.out.println("Parameterized school");
		this.number = number;
		this.name = name;
	}

}
