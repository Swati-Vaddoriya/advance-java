package com.Lib_mgt_hibernate;

public class StudentsPage {

	public static Student[] students = new Student[5];

//	public static void setStudents(Student[] students) {
//		StudentsPage.students = students;
//	}

	public static void show() {
		System.out.println("---------------------------------------------------");
		System.out.println("|                  Students Page                  |");
		System.out.println("---------------------------------------------------");
		System.out.println("1  Add Students");
		System.out.println("2  Display all students");
		System.out.println("3  Exit");

		int input;

		do {
			System.out.print("\nPlease Enter your choice number : ");
			input = Input.takeInput();
		} while (!(input == 1 || input == 2 || input == 3));

		switch (input) {
		case 1:
			new StudentsPage().addStudents();
			break;
		case 2:
			new StudentsPage().displayStudents();
			break;
		case 3:
			HomePage.userChoice();
			break;
		}
	}

	public void addStudents() {
		System.out.println("--- Add Students Roll Numbers and names ---\n");

		for (int i = 0; i < students.length; i++) {
			System.out.print("Enter Roll Number : ");
			students[i] = new Student();
			int id = Input.takeInput();
			students[i].setId(id);
			System.out.print("Enter name : ");

			students[i].setName(Input.takeStringInput());
		}
		HomePage.userChoice();
	}

	public static void displayStudents() {
		System.out.println(" --- List of Students ---\n");

		if (students[0] != null) {
			for (int i = 0; i < students.length; i++) {
				if (students[i].name != null) {
					System.out.println((i + 1) + "> " + students[i].id + " -  " + students[i].name);
				}

			}
		} else {
			System.out.println("                      NO STUDENT RECORRDS ADDED..!!");
		}

		HomePage.userChoice();
	}

}
