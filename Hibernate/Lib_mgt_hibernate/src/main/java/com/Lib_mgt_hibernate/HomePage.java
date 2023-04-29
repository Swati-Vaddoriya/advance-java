package com.Lib_mgt_hibernate;

public class HomePage {

	public static void userChoice() {
		System.out.println("---------------------------------------------------");
		System.out.println("|                Home Page                        |");
		System.out.println("---------------------------------------------------");
//		System.out.println("\n---- Welcome To Library Management Application ----\n");

		System.out.println("1  Student Rrecords");
		System.out.println("2  Book Records");
		System.out.println("3  Manage Books");
		System.out.println("4  Exit");

		int input;

		do {
			System.out.print("\nPlease Enter your choice number : ");
			input = Input.takeInput();
		} while (!(input == 1 || input == 2 || input == 3 || input == 4));

		switch (input) {
		case 1:

			StudentsPage.show();
			break;

		case 2:

			BooksPage.show();
			break;

		case 3:
			ManageBooksPage.show();
			break;
		case 4:
			System.exit(0);
			break;

		}

	}

}
