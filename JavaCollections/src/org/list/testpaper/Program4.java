package org.list.testpaper;

import java.util.ArrayList;
import java.util.List;

public class Program4 {
	public static void main(String[] args) {
		// Get the each index value of 10 present in below list 
		//List = 10,20,30,90,10,10,40,50,10
		List<Integer> l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		l.add(10);
		System.out.println(l);
		int targetValue=10;
		List<Integer> l2=new ArrayList<>();
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==targetValue)
			{
				l2.add(i);
			}
		}
		System.out.println("Indices of "+targetValue+":"+l2);

		//Get the value 
		System.out.println(l.get(2));
		System.out.println(l.get(4));
		System.out.println(l.get(7));
		
	}

}
