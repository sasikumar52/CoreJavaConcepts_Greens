package org.test;
//NumberFormatException
public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String string="123@j";
		int i=Integer.parseInt(string);
		System.out.println(i);
	}

}
