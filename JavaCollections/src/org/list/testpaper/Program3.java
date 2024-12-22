package org.list.testpaper;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		int indexOf = l.indexOf(10);
		System.out.println("Index of 10 is:"+indexOf);
		//  Input:   List = 10,20,30,90,10,10,40,50
		List l2=new ArrayList();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(90);
		l2.add(10);
		l2.add(10);
		l2.add(40);
		l2.add(50);
		int lastIndexOf = l2.lastIndexOf(10);
		System.out.println("Last index of 10 is:"+lastIndexOf);
		int indexOf2 = l2.indexOf(50);
		System.out.println("Index of 50 is:"+indexOf2);
		int indexOf3 = l2.indexOf(90);
		System.err.println("Index of 90 is:"+indexOf3);
		
		
	}

}
