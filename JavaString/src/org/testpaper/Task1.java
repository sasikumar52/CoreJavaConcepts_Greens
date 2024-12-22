package org.testpaper;

public class Task1 {
	public static void main(String[] args) {
		//FInd the length of the strings
		String s="GreensTechnology";
		String s1="SeleniumAutomationtool";
		String s2="velmurugan";
		String s3="j a v a p r o g r a m";
		String s4="9095484678";
		System.out.println(".............Length of the strings........");
		System.out.println(s.length());
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
		
		System.out.println("........Last index of the strings...........");
		System.out.println(s.lastIndexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s2.lastIndexOf('n'));
		System.out.println(s3.lastIndexOf(""));
		System.out.println(s4.lastIndexOf('8'));
		
		System.out.println(".......Particular char in string");
		System.out.println(s.charAt(9));
		System.out.println(s1.charAt(11));
		System.out.println(s2.charAt(4));
		System.out.println(s3.charAt(8));
		System.out.println(s4.charAt(8));
		
	}

}
