package com.Lib_mgt_hibernate;

import java.util.Scanner;

public class TestClass2 {

	public static void main(String[] args) {
		System.out.println("\n--------Welcome To Library Management Prroject--------\n");

		System.out.println("1  Login");
		System.out.println("2  Sign Up");
		System.out.println("3  Exit");

		Scanner scanner = new Scanner(System.in);
		int input;

		do {
			System.out.print("Please Enter your choice number : ");
			input = scanner.nextInt();
		} while (!(input == 1 || input == 2 || input == 3));
		scanner.close();

		switch (input) {
		case 1:

			System.out.println("\n--- Welcome to LOG IN Screen---\n");

			break;
		case 2:
			System.out.println("\n--- Welcome to SIGN UP Screen---\n");

			break;

		}

	}

}
