package constructor;

public class School {
	public School() {
		System.out.println("Default school");
		this.name = "Mauni";
		this.number=501;

	}

	@Override
	public String toString() {
		return "School [number=" + number + ", name=" + name + "]";
	}


	public int number;
	public String name;

	public School(int number, String name) {
		System.out.println("Parameterized school");
		this.number = number;
		this.name = name;
	}

}
