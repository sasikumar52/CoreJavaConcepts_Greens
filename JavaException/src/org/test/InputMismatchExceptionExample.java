package org.test;

import java.util.Scanner;

//InputMismatchException
public class InputMismatchExceptionExample {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int nextInt=s.nextInt();
		System.out.println(nextInt);
	}

}
