package autowire;

public class ByTypePojo {
	public int age;
	public int number;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "ByTypePojo [age=" + age + ", number=" + number + "]";
	}

}
