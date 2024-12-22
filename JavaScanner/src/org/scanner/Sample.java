package org.scanner;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee name");
		String name = scanner.next();
		System.out.println("Enter Employee age");
		int age = scanner.nextInt();
		System.out.println("Enter Employee Gender");
		char gender = scanner.next().charAt(0);
		System.out.println("Enter Employee salary");
		float salary = scanner.nextFloat();
		System.out.println("Enter Employee Phone");
		long phone = scanner.nextLong();
		System.out.println("Enter Employee Marital Status");
		boolean marital = scanner.nextBoolean();
		System.out.println("Enter Employee Address");
		String address = scanner.nextLine();

		System.out.println("Employee Name is :" + name);
		System.out.println("Employee age is :" + age);
		System.out.println("Employee salary :" + salary);
		System.out.println("Employee phone is :" + phone);
		System.out.println("Employee Marital status is :" + marital);
		System.out.println("Employee Gender is :" + gender);
		System.out.println("Employee Address is :" + address);

	}

}
