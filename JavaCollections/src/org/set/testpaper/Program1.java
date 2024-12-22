package org.set.testpaper;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program1 {
	public static void main(String[] args) {
		//Create a HashSet for the below values
		//Input : List = 10,20,30,40,50,60,70,80,90,10,20
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);
		System.out.println("Hash Set:"+s);
		for (Integer x : s) {
			System.out.println(x);
		}
		//Create a LinkedHashSet 
		Set<Integer> s1=new LinkedHashSet<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(70);
		s1.add(80);
		s1.add(90);
		s1.add(10);
		s1.add(20);
		System.out.println("Linked Hash Set:"+s1);
		for (Integer y : s1) {
			System.out.println(y);
		}
		// Create a TreeSet
		Set<Integer> s2=new TreeSet<Integer>();
		s2.add(10);
		s2.add(20);
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(70);
		s2.add(80);
		s2.add(90);
		s2.add(10);
		s2.add(20);
		System.out.println("Tree Set:"+s2);
		for (Integer z : s2) {
			System.out.println(z);
		}

	}
}
