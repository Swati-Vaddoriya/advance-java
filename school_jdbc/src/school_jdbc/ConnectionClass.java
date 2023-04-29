package school_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
	public static Connection con;

	
	public static Connection create () {
		
		
		try {
			// Load the driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create connection
			String url = "jdbc:mysql://localhost:3306/b6";
			con = DriverManager.getConnection(url,"root","root");
			return con;
		}
		catch(Exception e) {
			e.printStackTrace();
			return con;
		}
	}
}
