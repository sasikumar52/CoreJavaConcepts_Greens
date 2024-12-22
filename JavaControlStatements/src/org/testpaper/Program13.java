package org.testpaper;

import java.util.Scanner;

//Pattern program
public class Program13 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=in.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = n-i; j > 1; j--) {//Loop for Blank Space
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)//Loop for star
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
