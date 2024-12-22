package org.scanner;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("ENter student id");
		int id=scanner.nextInt();
		System.out.println("Enter Student Name");
		String name=scanner.next();
		System.out.println("Enter Mark1");
		int mark1=scanner.nextInt();
		System.out.println("Enter Mark2");
		int mark2=scanner.nextInt();
		System.out.println("Enter Mark3");
		int mark3=scanner.nextInt();
		System.out.println("Enter Mark4");
		int mark4=scanner.nextInt();
		System.out.println("Enter Mark5");
		int mark5=scanner.nextInt();
		
		int sum=mark1+mark2+mark3+mark4+mark5;
		int n=5;
		System.out.println("Student id is :"+id);
		System.out.println("Student name is :"+name);
		System.out.println("Student Total is :"+sum);
		System.out.println("Avg total is :"+sum/n);
		
	}

}
