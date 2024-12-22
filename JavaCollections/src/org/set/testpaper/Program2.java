package org.set.testpaper;

import java.util.HashSet;
import java.util.Set;

public class Program2 {
	//Create a new HashSet with values and return the common values
    //Input : List = 10,20,30,90,10,10,40,50
    //Input : List = 30,40,50,60,80

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(90);
		s.add(10);
		s.add(10);
		s.add(40);
		s.add(50);
		System.out.println("Set 1 values:"+s);
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(80);
		System.out.println("Set 2 values:"+s1);
		s1.addAll(s);
		System.out.println("All values:"+s1);
		//to get common values
		s1.retainAll(s);
		System.out.println("Common values:"+s1);
		
		
	}
}
