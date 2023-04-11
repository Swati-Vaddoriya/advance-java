package com.Lib_mgt_hibernate;

public class ManageBooksPage {
	public static void show() {
		System.out.println(" \n--- Manage Books Page --- \n");
		System.out.println("1  Issue Books");
		System.out.println("2  Return Books");
		System.out.println("3  Exit");

		int input;

		do {
			System.out.print("\nPlease Enter your choice number : ");
			input = Input.takeInput();
		} while (!(input == 1 || input == 2 || input == 3));

		switch (input) {
		case 1:

			ManageBooksPage.issueBook();
			break;

		case 2:

			ManageBooksPage.returnBook();
			break;

		case 3:
			HomePage.userChoice();
			break;

		}
	}

	private static void returnBook() {
		// TODO Auto-generated method stub

	}

	private static void issueBook() {
		if (StudentsPage.students[0] != null) {
			for (int i = 0; i < StudentsPage.students.length; i++) {
				if (StudentsPage.students[i].name != null) {
					System.out.println(
							(i + 1) + "> " + StudentsPage.students[i].id + " -  " + StudentsPage.students[i].name);
				}

			}
		} else {
			System.out.println("                      NO STUDENT RECORRDS ADDED..!!");
		}
		System.out.println();

		if (BooksPage.books[0] != null) {
			for (int i = 0; i < BooksPage.books.length; i++) {
				if (BooksPage.books[i].bookName != null) {
					System.out.println((i + 1) + "> " + BooksPage.books[i].bookName);
				}

			}
		} else {
			System.out.println("                       NO BOOK RECORRDS ADDED..!!");
		}

//		BooksPage.displayBooks();
//		StudentsPage.show();
//		BooksPage.show();

		System.out.print("Enter Student roll number to issue the book : ");
		int stud = Input.takeInput();
		System.out.print("Enter book number to be issued : ");
		int book = Input.takeInput();
//		System.out.println("stud " + stud + " book " + book);
//		if (stud > 0 && stud < StudentsPage.students.length && stud > 0 && book < BooksPage.books.length) {
		if (true) {
			System.out.println("\nissued successfully...\n");
			BooksPage.books[book - 1].setStudentName(StudentsPage.students[stud - 1].getName());
			;
			BooksPage.books[book - 1].setIssued(true);
			System.out.println(BooksPage.books[book - 1].getBookName());
			System.out.println(StudentsPage.students[stud - 1].getName());
//			String bookIssued = BooksPage.books[book - 1].bookName;
//			BooksPage.books[book - 1].studentName = StudentsPage.students[stud - 1].name;
//			String issuedToStudent = StudentsPage.students[stud - 1].name;
		} else {
			System.out.println("not issued");

		}

		if (BooksPage.books[0] != null) {
			for (int i = 0; i < BooksPage.books.length; i++) {
				if (BooksPage.books[i].bookName != null) {
					if (BooksPage.books[i].studentName == null) {
						System.out.println(BooksPage.books[i].bookName);
					} else {
						System.out.println(BooksPage.books[i].bookName + "  --->  " + StudentsPage.students[stud - 1].name);

					}

				}

			}
		} else {
			System.out.println("                       NO BOOK RECORRDS ADDED..!!");
		}

		ManageBooksPage.show();

	}

}
