package com.Lib_mgt_hibernate;

public class TestClass {

	public static void main(String[] args) {
//		System.out.print(ConsoleColors.BLUE_BOLD);
		System.out.println("---------------------------------------------------");
		System.out.println("|    Welcome To Library Management Application    |");
		System.out.println("---------------------------------------------------");
//		System.out.print(ConsoleColors.RESET);
		showLogInOptions();

	}

	public static void showLogInOptions() {
		System.out.println("1  Login");
		System.out.println("2  Sign Up");
		System.out.println("3  Exit");

		int input;

		do {
			System.out.print("\nPlease Enter your choice number : ");
			
			input = Input.takeInput();
			} while (!(input == 1 || input == 2 || input == 3));

		switch (input) {
		case 1:
			Auth.logIn();
			break;
		case 2:
			Auth.signUp();
			break;

		}

	}

}
