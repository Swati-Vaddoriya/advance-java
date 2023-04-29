package com.Lib_mgt_hibernate;

import java.util.Scanner;

public class Input {

	static Scanner scanner = new Scanner(System.in);
	
	public static int takeInput() {
		return scanner.nextInt();
	}
	public static String takeStringInput() {
		return scanner.next();
	}
}
