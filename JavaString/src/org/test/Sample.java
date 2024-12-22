package org.test;

public class Sample {
	public static void main(String[] args) {
		String s=" Java Application ";
		String s1="java application";
		System.out.println(s+"\n"+s1);
		//to find length
		int a = s.length();
		System.out.println(a);
		//to check str starts with particular str or not
		boolean startsWith = s.startsWith("Ja");
		System.out.println(startsWith);
		//to check str ends with particular str or not
		boolean endsWith = s.endsWith("on");
		System.out.println(endsWith);
		//to conver str into uppercase
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		//to conver str into lowercase
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		//to find index position ....1st occurence
		System.out.println(s.indexOf('a'));
		//to find index position ....last occurence
		System.out.println(s.lastIndexOf('a'));
		//to get particular char
		System.out.println(s.charAt(2));
		//to check whether str is empty or not
		System.out.println(s.isEmpty());
		//to check whether str is present or not
		System.out.println(s.contains("cat"));
		//to check whether both str is equal or not
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		//to replace particular char
		System.out.println(s.replace('a', '@'));
		//to replace particular str
		String d = s.replaceAll(s, "Python");
		System.out.println(d);
		//to get str from another str
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,14));
		//to merge both strs
		System.out.println(s.concat(s1));
		//to remove unwanted space present in str
		System.out.println(s.trim());
	
	}

}
