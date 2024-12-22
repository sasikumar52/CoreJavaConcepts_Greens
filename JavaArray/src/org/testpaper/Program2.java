package org.testpaper;
//Write a Java program to calculate the average value of array elements
public class Program2 {
	public static void main(String[] args) {
		 int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        
	        // Initialize a variable 'sum' to store the sum of array elements.
	        int sum = 0;
	        
	        // Use a for loop to iterate over the elements of the 'numbers' array.
	        for (int i = 0; i < a.length; i++) {
	            // Add the current element to the sum.
	            sum = sum + a[i];
	        }
	        
	        // Calculate the average value by dividing the sum by the number of elements.
	        double average = sum / a.length;
	        
	        // Print the calculated average value to the console.
	        System.out.println("Average value of the array elements is : " + average); 
		
	}

}
