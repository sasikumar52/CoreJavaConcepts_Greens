package org.test;

public class Sample2 {
	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
			System.out.println(3/0);
		} catch (ArithmeticException e) {
			System.out.println("Am in first catch");
		}
		catch (NullPointerException e) {
			System.out.println("Am in second catch");
		}
		System.out.println(5);
	}

}
