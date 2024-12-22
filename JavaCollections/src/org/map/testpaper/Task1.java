package org.map.testpaper;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task1 {
	// Create a HashMap with the below key and values
	// key : 10,20,30,40,50,60,10,50,40
	// values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "java");
		map.put(20, "sql");
		map.put(30, "oops");
		map.put(40, "sql");
		map.put(50, "oracle");
		map.put(60, "DB");
		map.put(10, "selenium");
		map.put(50, "psql");
		map.put(40, "hadoop");
		System.out.println(map);
		// To get keys only
		System.out.println("The keys are:" + map.keySet());
		// To get Values only
		System.out.println("The Values are:" + map.values());
		//to iterate the values
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
