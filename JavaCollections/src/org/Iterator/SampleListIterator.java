package org.Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SampleListIterator {

	public static void main(String[] args) {
		
		List<Integer>list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		ListIterator<Integer> listIterator = list.listIterator();
		while(listIterator.hasNext())
		{
			Integer x=listIterator.next();
			System.out.println(x);
		}
		System.out.println("-------------------------");
		while(listIterator.hasPrevious())
		{
			Integer y=listIterator.previous();
			System.out.println(y);
		}
		
	}
}
