package org.map.testpaper;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task3 {
	// Create a TreeHashMap with the below key and values
	// key : !,@,#,$,%,^,&,*,(,
	// Values : 10,20,30,40,50,60,10,50,40
	public static void main(String[] args) {
		Map map = new TreeMap();
		map.put('!', 10);
		map.put('@', 20);
		map.put('#', 30);
		map.put('$', 40);
		map.put('%', 50);
		map.put('^', 60);
		map.put('&', 10);
		map.put('*', 50);
		map.put('(', 40);
		System.out.println(map);
		System.out.println("The keys are:" + map.keySet());
		// To get Values only
		System.out.println("The Values are:" + map.values());
		//To iterate the values
		Set entrySet = map.entrySet();
		for (Object object : entrySet) {
			System.out.println(object);
		}

	}

}