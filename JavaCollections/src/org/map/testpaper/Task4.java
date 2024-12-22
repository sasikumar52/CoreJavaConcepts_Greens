package org.map.testpaper;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task4 {
	// Create a HashTable with the below key and values
	// Key : vel,Ganesh,Dinesh,Vengat,subash
	// Values : Selenium,framework,oracle,corejava,jira
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("Vel", "Selenium");
		map.put("Ganesh", "Framework");
		map.put("Dinesh", "Oracle");
		map.put("Venkat", "CoreJava");
		map.put("Subash", "Jira");
		System.out.println(map);
		System.out.println("The keys are:" + map.keySet());
		// To get Values only
		System.out.println("The Values are:" + map.values());
		//to iterate the values
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}

	}

}
