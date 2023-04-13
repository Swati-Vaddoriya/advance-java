package designPattern;

public class User {
	public int userId;
	public String name;
	public String password;

//	@Override
//	public String toString() {
//		return "User [userId=" + userId + ", name=" + name + ", password=" + password + "]";
//	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {	
		this.userId = userId;
	}

	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
