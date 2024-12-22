package org.scanner;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter empId");
		int id=scanner.nextInt();
		System.out.println("Enter empName");
		String name=scanner.next();
		System.out.println("Enter empEmail");
		String mail=scanner.next();
		System.out.println("Enter empPhone");
		long phone=scanner.nextLong();
		System.out.println("Enter empSalary");
		float salary=scanner.nextFloat();
		System.out.println("Enter empGender");
		char gender=scanner.next().charAt(0);
		System.out.println("Enter empCity");
		String city=scanner.next();
		
		System.out.println("EMployee id is :"+id);
		System.out.println("Employee Name is :"+name);
		System.out.println("EMployee Mail is :"+mail);
		System.out.println("Employee Phone is :"+phone);
		System.out.println("Employee salary is :"+salary);
		System.out.println("Employee Gender is :"+gender);
		System.out.println("Employee City is :"+city);
		
	}

}
