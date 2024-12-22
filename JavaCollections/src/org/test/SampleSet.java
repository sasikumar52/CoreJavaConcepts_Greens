package org.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class SampleSet {
	public static void main(String[] args) {
		Set<Integer>s=new LinkedHashSet<Integer>();
		//To add values
		s.add(10);
		s.add(20);
		s.add(40);
		s.add(30);
		s.add(50);
		System.out.println(s);
		//To find size
		System.out.println(s.size());
		//TO check whether set is empty or not
		System.out.println(s.isEmpty());
		//To check whether particular value present or not
		System.out.println(s.contains(20));
		//To remove particular value in set
		s.remove(30);
		System.out.println(s);
		//TO clear all values
	//	s.clear();
	//	System.out.println(s);
		//To read all values
		for (Integer x : s) {
			System.out.println(x);
		}
		


	}

}
