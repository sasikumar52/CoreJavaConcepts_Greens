package org.list.testpaper;

import java.util.ArrayList;
import java.util.List;

public class Program5 {
	// List = 105,205,305,405,505,605,705,805
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(105);
		list.add(205);
		list.add(305);
		list.add(405);
		list.add(505);
		list.add(605);
		list.add(705);
		list.add(805);
		System.out.println("....For Loop....");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(".....For each Loop......");
		for (Integer integer : list) {
			System.out.println(integer);
		}
		//Add a value 50 in the 2nd index and display the list after adding.
       // Input : List = 10,20,30,90,10,10,40,50
		List<Integer>list2=new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(90);
		list2.add(10);
		list2.add(10);
		list2.add(40);
		list2.add(50);
		System.out.println("Before Adding the value:"+list2);
		list2.add(2, 50);
		System.out.println("After adding the value:"+list2);
		
		
	}

}
