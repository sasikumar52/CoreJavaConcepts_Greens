package org.testpaper;

import java.util.Scanner;
//Factorial
public class Program6 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial of given number is:"+fact);
	}
}
