package app.day7.map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		// displays data in sorted order
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("Java", 1);
		tm.put("Angular", 2);
		tm.put("React", 3);
		tm.put("React Native", 4);
		
		System.out.println(tm);
		

	}
}
