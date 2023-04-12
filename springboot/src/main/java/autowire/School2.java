package autowire;

public class School2 {
	public School2() {
		System.out.println("Default school");

	}

	@Override
	public String toString() {
		return "School [number=" + number + ", name=" + name +", city=" + city + "]";
	}


	public int number;
	public String name;
	public String city;

	public School2(int number, String name,String city) {
		System.out.println("Parameterized school");
		this.number = number;
		this.name = name;
		this.city = city;
	}

}
