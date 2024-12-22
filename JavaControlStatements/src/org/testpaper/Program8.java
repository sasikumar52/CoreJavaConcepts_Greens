package org.testpaper;

import java.util.Scanner;
//Find prime number or not.
public class Program8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		int f = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				f++;
			}
		}
		if (f == 2) {
			System.out.println("The given number is prime number");
		} else {
			System.out.println("The given number is not a prime number");
		}

	}

}
