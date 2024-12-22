package org.testpaper;

import java.util.Scanner;

//Reverse the number
public class Program11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		int reverse = 0, rem;
		while (n != 0) {
			rem = n % 10;
			reverse = (reverse * 10) + rem;
			n = n / 10;
		}
		System.out.println("The reverse number is :" + reverse);
	}
}
