package app.day7.map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("Java", 1);
		hm.put("Angular", 2);
		hm.put("React", 3);
		hm.put("React Native", 4);
		
		// HashMap allows one null key and any null values
		hm.put(null, null);
		
		// it doesn't create new null key, instead overrides the previous value
		hm.put(null, 5);
		hm.put("avs", null);
		
		System.out.println(hm);
		
		System.out.println("Value of key java is " + hm.get("Java"));
		
		
		
	}
	
}
