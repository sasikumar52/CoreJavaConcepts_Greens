package org.test;
//Array
public class Sample {
	public static void main(String[] args) {
		//Syntax
		//DataType VarName[]=New DataType[Size]
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//To find size
		System.out.println(a.length);
		//To get particular value
		System.out.println(a[2]);
		//Read the values in array
		System.out.println("........For loop.........");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(".......For Each loop.......");
		for (int x : a) {
			System.out.println(x);
		}
		
		//2D Array
		int b[][]=new int[2][3];
		b[0][0]=10;
		b[0][1]=20;
		b[0][2]=30;
		b[1][0]=40;
		b[1][1]=50;
		b[1][2]=60;
		System.out.println("......2D Array.......");
		System.out.println(b[1][1]);
		//To read values in array
		System.out.println("........For loop.........");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(b[i][j]);
			}
		}
		System.out.println(".......For Each loop.......");
		for (int[] k : b) {
			for (int l : k) {
				System.out.println(l);
			}
		}

		
		
		
		
		
		
	}

}
