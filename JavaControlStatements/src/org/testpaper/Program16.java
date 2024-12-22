package org.testpaper;

import java.util.Scanner;
//Count the number
public class Program16 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=in.nextInt();
		 int count = 0;
		    for (; num != 0; num /= 10, ++count) {
		    }
		    System.out.println("Number of digits: " + count);
	}

}
