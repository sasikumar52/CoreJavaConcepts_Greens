package org.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SampleMap {
	public static void main(String[] args) {
		Map<Integer, String>map=new LinkedHashMap<Integer, String>();
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "Sql");
		map.put(4, "Selenium");
		map.put(5, "Manual");
		System.out.println(map);
		//To find size
		System.out.println(map.size());
		//To get particular value
		System.out.println(map.get(4));
		//To get only values
		System.out.println(map.values());
		//To get only keys
		System.out.println(map.keySet());
		//To remove values
		map.remove(2);
		System.out.println(map);
		//To clear values
		//map.clear();
		//System.out.println(map);
		//To check particular key is present or not
		System.out.println(map.containsKey(2));
		//To check particular value is present or not
		System.out.println(map.containsValue("Sql"));
		//To iterate map
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> e : entrySet) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
		
	}

}
