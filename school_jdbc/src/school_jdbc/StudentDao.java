package school_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.CallableStatement;

public class StudentDao {

	public static boolean insertStudent(Student st) {
		boolean status = false;
		try {
			Connection con = ConnectionClass.create();
			 String query = "insert into student values(?,?,?)";
		       
		        // Preparing a CallableStateement
		        CallableStatement cs = (CallableStatement) con.prepareCall(query);
		       
		        cs.setInt(1, st.getRoll());
		        cs.setString(2, st.getName());
		        cs.setString(3, st.getMobile());
		        cs.execute();
			System.out.println("Student added successfully");
			status = true;
			con.close();
			return status;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public static boolean insertStudent2(Student st) {
		boolean status = false;
		try {
			Connection con = ConnectionClass.create();
			String query = "insert into student (roll,name,mobile) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, st.getRoll());
			pstmt.setString(2, st.getName());
			pstmt.setString(3, st.getMobile());
			
			pstmt.executeUpdate();
			System.out.println("Student added successfully");
			status = true;
			con.close();
			return status;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static void deleteStudent(int droll) {
		try {
			Connection con = ConnectionClass.create();
			String query = "delete from student where roll=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, droll);

			pstmt.executeUpdate();
			System.out.println("Student deleted successfully");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void showAll() {
		try {
			Connection con = ConnectionClass.create();
			String query = "select * from student";
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String mobile = rs.getString(3);
				System.out.println("Roll : " + id);
				System.out.println("name : " + name);
				System.out.println("mobile : " + mobile);
				System.out.println("************************************");

			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateStudent(int rno, String name, String mobile) {
		try {
			Connection con = ConnectionClass.create();
			String query = "Update student set name=?, mobile=? where roll =?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, mobile);
			ps.setInt(3, rno);

			ps.executeUpdate();
			System.out.println("Student updated successfully");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		// TODO Auto-generated method stub
		
	}

}
