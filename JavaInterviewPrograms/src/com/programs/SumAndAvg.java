package com.programs;

import java.util.Scanner;

public class SumAndAvg {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit");
		int sum=0,a;
		int n=in.nextInt();
		for (int i = 1; i <=n; i++) {
			System.out.println("Enter the number " + i);
			a=in.nextInt();
			sum+=a;
			
		}
		System.out.println(sum);
		System.out.println("Avg of sum:"+sum/n);
	}

}
