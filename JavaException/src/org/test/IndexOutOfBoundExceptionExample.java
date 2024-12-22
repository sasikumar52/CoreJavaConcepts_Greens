package org.test;

import java.util.ArrayList;
import java.util.List;

//IndexOutOfBoundException
public class IndexOutOfBoundExceptionExample {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println(li.get(5));
	}

}
