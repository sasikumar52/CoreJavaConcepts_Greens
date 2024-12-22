package org.testpaper;
import java.util.Scanner;
//Candidate is eligible to vote
public class Program1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=in.nextInt();
		if(age>18)
		{
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not Eligible for vote");
		}
	}

}
