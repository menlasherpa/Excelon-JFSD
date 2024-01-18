package app.day07.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
		
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
		ht.put("Java", 1);
		ht.put("Angular", 2);
		ht.put("React", 3);
		ht.put("React Native", 4);
		
		// hashtable doesn't allow any null keys and values
//		ht.put("ops", null);
//		ht.put(null, null);
//		ht.put(null, 6);
		
		System.out.println(ht);
		
		System.out.println("Value of key java is " + ht.get("Java"));
		
		
		Enumeration<String> en = ht.keys();
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println("Key: " + key + " Value: " + ht.get(key));
		}
		
	}
}
