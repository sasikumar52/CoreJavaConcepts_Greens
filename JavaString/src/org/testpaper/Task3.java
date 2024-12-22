package org.testpaper;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter email id");
		String string=scanner.next();
		if (string.contains("@")) {
			System.out.println("Valid Email id");
		}
		else {
			System.out.println("Invalid Email id");
		}
		
	}

}
