package org.testpaper;

import java.util.Scanner;
//Fibonacci series
public class Program7 {
	public static void main(String[] args) {
		int a = -1, b = 1, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Limit");
		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
