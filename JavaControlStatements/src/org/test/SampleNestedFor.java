package org.test;

public class SampleNestedFor {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Inner Loop:"+j);
			}
			System.out.println("Outer Loop:"+i);
		}
	}

}
