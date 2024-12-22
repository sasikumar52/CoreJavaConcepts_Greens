package org.testpaper;

//COunt Vowels and constants
public class Task4 {
	public static void main(String[] args) {
		String sample = "Welcome";
		int vow = 0, con = 0;
		sample.toLowerCase();
		for (int i = 0; i < sample.length(); i++) {
			if (sample.charAt(i) == 'a' || sample.charAt(i) == 'e' || sample.charAt(i) == 'i' || sample.charAt(i) == 'o'
					|| sample.charAt(i) == 'u') {
				vow++;

			} else  {
				con++;
			}
		}
		System.out.println("Number of vowels:"+vow);
		System.out.println("Number of constants:"+con);
	}

}
