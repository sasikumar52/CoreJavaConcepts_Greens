package org.testpaper;

//Write a Java program to remove duplicates from array
public class Program3 {

	public static void main(String[] args) {
		int a[] = { 10, 10, 20, 50, 60, 80, 60, 50 };
		int n = a.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j] && a[i] != 0) {
					a[j] = 0;
				}
			}
			if (a[i] != 0) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
	}
}
