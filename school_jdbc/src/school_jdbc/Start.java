package school_jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("Welcome to JDBC Students app");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			System.out.println();
			System.out.println("1. Add Student");
			System.out.println("2. Delete Student");
			System.out.println("3. Display students");
			System.out.println("4. Update student");
			System.out.println("5. Exit app");

			int option = Integer.parseInt(br.readLine());

			switch (option) {
			case 1:
				// ADD STUDENT
				System.out.println("Enter Student information:");
				System.out.println("Roll number : ");
				int id = Integer.parseInt(br.readLine());
				System.out.println("Name : ");
				String name = br.readLine();
				System.out.println("Mobile number :");
				String mobile = br.readLine();

				Student st = new Student(id, name, mobile);
				StudentDao.insertStudent(st);
				break;

			case 2:
				// DELETE THE STUDENT
				System.out.println("Roll number : ");
				int roll = Integer.parseInt(br.readLine());
		
				StudentDao.deleteStudent(roll);
				break;

			case 3:
				// DISPLAY ALL STUDENTS
				
				StudentDao.showAll();
				break;
			case 4:
				// UPDATE STUDENT		
				System.out.println("Roll number : ");
				
				int rno = Integer.parseInt(br.readLine());
				System.out.println("Name : ");
				String name2 = br.readLine();
				System.out.println("Mobile number :");
				String mobile2 = br.readLine();

				StudentDao.updateStudent(rno,name2,mobile2);
				break;
			case 5:
				System.out.println("Thank you for visiting the application");
				System.exit(0);

			default:
				break;
			}
		}
	}
}
