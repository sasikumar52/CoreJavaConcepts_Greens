package org.test;

public class CourseDetails {
	public static void main(String[] args) {
		String s="Java";
		String s1="Java";
		String s2="SQL";
		System.out.println("Literal String");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		String a=s.concat(s1);
		System.out.println("Immutable String");
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		String s3=new String("Java");
		String s4=new String("Java");
		String s5=new String("SQL");
		System.out.println("Non Literal String");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		
		StringBuffer s6=new StringBuffer("Java");
		StringBuffer s7=new StringBuffer("Java");
		StringBuffer s8=new StringBuffer("SQL");
		StringBuffer b=s6.append(s7);
		System.out.println("Muttable String");
		System.out.println(System.identityHashCode(s6));
		System.out.println(System.identityHashCode(s7));
		System.out.println(System.identityHashCode(s8));
		System.out.println(b);
		System.out.println(System.identityHashCode(b));

		String xString="Welcome to java world";
		String regex=" ";
		String[] split = xString.split(regex);
		for (String y : split) {
			System.out.println(y);
		}
		String yString="Welcome to java class";
		String regex1="l";
		String[] split2 = yString.split(regex1);
		for (String z : split2) {
			System.out.println(z);
		}

		

		
		
		

		
	}

}
