package app.day06.collectiondemo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		
		// no order
		// no duplicates
		HashSet<String> hs = new HashSet<String>();
		
		// Set is interface parent of HashSet class
		Set<String> set = new HashSet<String>();
		
		hs.add("Lakpa");
		hs.add("Doma");
		hs.add("Sherpa");
		hs.add("Menlaa");
	
		hs.add("Lakpa");
		
		System.out.println(hs);
		
		
		set.add("Green");
		System.err.println(set);
		
	}
}
