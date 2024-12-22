package org.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SampleList {
	public static void main(String[] args) {
		List l=new LinkedList();
		//To add values
		l.add(10);
		l.add("20");
		l.add(30.8f);
		l.add(true);
		l.add(50);
		System.out.println(l);
		//To find size
		int a = l.size();
		System.out.println("Size of the list is:"+a);
		//To get particular value
		Object b = l.get(2);
		System.out.println("Value of 2nd index position is:"+b);
		List<Integer>list=new LinkedList<Integer>();//Only Integer
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(10);

		System.out.println(list);

		//TO get particular value
		Integer i = list.get(2);
		System.out.println(i);
		//TO check whether list is empty or not
		boolean empty = list.isEmpty();
		System.out.println(empty);
		//To check whether particular value present or not
		System.out.println(list.contains(20));
		//To find index position......1st occurence
		System.out.println(list.indexOf(10));
		//To find index position......last occurence
		System.out.println(list.lastIndexOf(10));
		//To replace value
		list.set(2, 11);
		System.out.println(list);
		//To remove value in list
		list.remove(1);
		System.out.println(list);
		//To read values in list
		System.out.println("...........For loop..........");
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
		//For Each loop
		System.out.println("...........For Each loop......");
		for (Integer x : list) {
			System.out.println(x);
		}
		List<Integer>list2=new ArrayList<Integer>();
		//To add values in list to list
		list2.addAll(list);
		//To add values in based on index
		list2.add(2,100);
		list2.add(3, 200);
		System.out.println("Added Values:"+list2);
		//To get common values
		list2.retainAll(list);
		System.out.println("Common Values:"+list2);
		//To remove common values
		list2.removeAll(list);
		System.out.println("Removed Values:"+list2);

		
		
		
	}

}
