package app.day6.example.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		// insertion order
		// allows duplicates
		ArrayList<String> arrList = new ArrayList<String>();
		
		arrList.add("Lakpa");
		arrList.add("Doma");
		arrList.add("Menlaa");
		arrList.add("Lakpa");
		
		System.out.println(arrList);
		
		
		// 3 ways to display elements inside the list
		
		// type 1 (for each loop)
		System.out.println("=========================");
		for (String s : arrList) {
			System.out.println(s);
		}
		
		// type 2 (for loop)
		System.out.println("=========================");
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		// type 3 (iterator)
		System.out.println("=========================");
		Iterator<String> i = arrList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		System.out.println("=========================");
		System.out.println("There are " + arrList.size()  + " elements in the ArrayList");
		System.out.println("List contains Menlaa? " + arrList.contains("Menlaa"));
		System.out.println("Second element in the array list is " + arrList.get(1));
		System.out.println("Index of Lakpa is " + arrList.indexOf("Lakpa"));	
		
		
		List<String> list = new ArrayList<String>();
		list.add("Green");
		System.out.println(list);
	
	}
}
