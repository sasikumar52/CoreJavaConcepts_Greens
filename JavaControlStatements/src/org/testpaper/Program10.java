package org.testpaper;

import java.util.Scanner;

//Find Amstrong number or not
public class Program10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 3 digit number");
		int number = in.nextInt();
		int d1, d2, d3, temp;
		temp = number;

		d3 = temp % 10;
		temp = temp / 10;

		d2 = temp % 10;
		temp = temp / 10;

		d1 = temp % 10;
		int result = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);
		if (result == number) {
			System.out.println("Given number is armstrong number");
		} else {
			System.out.println("Given number is not an armstrong number");
		}

	}

}
