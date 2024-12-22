package org.set.testpaper;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program3 {
	public static void main(String[] args) {
		//Create a new LinkedHashSet with values and return the common values
	      //      Input : List = 10,20,30,90,10,10,40,50
	      //      Input : List = 10,20,60,50,40,70,80,90
		Set<Integer> s=new LinkedHashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(90);
		s.add(10);
		s.add(10);
		s.add(40);
		s.add(50);
		System.out.println("Linked HashSet1 Values:"+s);
		Set<Integer> s1=new LinkedHashSet<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(60);
		s1.add(50);
		s1.add(40);
		s1.add(70);
		s1.add(80);
		s1.add(90);
		System.out.println("Linked Hashset2 Values:"+s1);
		s1.addAll(s);
		System.out.println("All Values:"+s1);
		//To get common values
		s1.retainAll(s);
		System.out.println("Common values:"+s1);

		
	}

}
