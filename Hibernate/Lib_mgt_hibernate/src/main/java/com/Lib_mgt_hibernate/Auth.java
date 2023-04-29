package com.Lib_mgt_hibernate;

public class Auth {

	public static void logIn() {


		System.out.println("---------------------------------------------------");
		System.out.println("|                     Log In Page                 |");
		System.out.println("---------------------------------------------------");		int id, pwd;

		System.out.print("Enter User ID : ");
		id = Input.takeInput();
		System.out.print("Enter Password : ");
		pwd = Input.takeInput();

		if (id == 123 && pwd == 123) {
			System.out.println("\n                     >>> Log in unsuccessful <<<<\n");

			

			HomePage.userChoice();

		} else {
			System.out.println("You have entered either incorrect ID or Password\n");
			TestClass.showLogInOptions();
//			TestClass2.showLogInOptions();
		}
	}

	public static void signUp() {

		System.out.println("---------------------------------------------------");
		System.out.println("|                  Sign Up Page                   |");
		System.out.println("---------------------------------------------------");
		int id, pwd;

		System.out.print("User ID : ");
		id = Input.takeInput();
		System.out.print("Password : ");
		pwd = Input.takeInput();

		System.out.println("\n--- Signed Up Successfully ---\n");
		HomePage.userChoice();

	}

}
