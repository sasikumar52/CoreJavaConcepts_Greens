package org.map.testpaper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Task2 {
	// Create a LinkedHashMap with the below key and values
	// key : 10,20,30,40,50,60,10,50,40
	// Values : 10,20,30,40,50,60,10,50,40
	public static void main(String[] args) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		map.put(10, 10);
		map.put(20, 20);
		map.put(30, 30);
		map.put(40, 40);
		map.put(50, 50);
		map.put(60, 60);
		map.put(10, 10);
		map.put(50, 50);
		map.put(40, 40);
		System.out.println(map);
		System.out.println("The keys are:" + map.keySet());
		// To get Values only
		System.out.println("The Values are:" + map.values());
		// to iterate the values
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

}
