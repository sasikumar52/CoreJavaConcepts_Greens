package org.list.testpaper;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("10");
		l.add("20");
		l.add("30");
		l.add("90");
		l.add("10");
		l.add("10");
		l.add("40");
		l.add("50");
		int size = l.size();
		System.out.println("Size of the list is :"+size);
		
	}

}
