package org.Iterator;

import java.util.Enumeration;
import java.util.Vector;

public class SampleEnumerator {

	public static void main(String[] args) {
		Vector<Integer> li = new Vector<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);

		Enumeration<Integer> elements = li.elements();
		while (elements.hasMoreElements()) {
			Integer nextElement = elements.nextElement();
			System.out.println(nextElement);

		}
	}

}
