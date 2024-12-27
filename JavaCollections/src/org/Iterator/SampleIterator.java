package org.Iterator;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SampleIterator {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);

		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
			if (next == 20) {
				iterator.remove();
			}
		}
		System.out.println(set);

	}
}
