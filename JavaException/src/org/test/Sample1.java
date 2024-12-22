package org.test;
//try catch finally
public class Sample1 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(3/0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Dont divide by zero");
		}
		System.out.println(4);
	}

}
