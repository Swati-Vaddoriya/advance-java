package com.Lib_mgt_hibernate;

public class BooksPage {

	public static Book[] books = new Book[5];

	public static void show() {
		System.out.println("---------------------------------------------------");
		System.out.println("|                    Books Page                   |");
		System.out.println("---------------------------------------------------");
		System.out.println("1  Add Books");
		System.out.println("2  Display all books");
		System.out.println("3  Exit");

		int input;

		do {
			System.out.print("\nPlease Enter your choice number : ");
			input = Input.takeInput();
		} while (!(input == 1 || input == 2 || input == 3));

		switch (input) {
		case 1:
			BooksPage.addBooks();
			break;
		case 2:
			displayBooks();
			break;
		case 3:
			HomePage.userChoice();
			break;
		}
	}

	private static void addBooks() {
		System.out.println("                                        Add Books");

		for (int i = 0; i < books.length; i++) {
			System.out.print("Enter book name : ");
			books[i] = new Book();
			books[i].setBookName(Input.takeStringInput());
		}
		System.out.println("Books added successfully..!");
		BooksPage.show();

	}

	public static void displayBooks() {
		System.out.println("                                       Books List");

		if (books[0] != null) {
			for (int i = 0; i < books.length; i++) {
				if (books[i].bookName != null) {
					System.out.println((i + 1) + "> " + books[i].bookName);
				}

			}
		} else {
			System.out.println("                       NO BOOK RECORRDS ADDED..!!");
			BooksPage.show();
		}

	}

}
