package school_jdbc;

public class Student{
	int roll;
	String name;
	String mobile;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Student(int roll, String name, String mobile) {
		super();
		this.roll = roll;
		this.name = name;
		this.mobile = mobile;
	}
}