package org.testpaper;

import java.util.Scanner;

//Print odd or even 
public class Program2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENter the number");
		int a=in.nextInt();
		if(a%2==0)
		{
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
	}

}
