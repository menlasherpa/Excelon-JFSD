package app.day07.equalsandhashcodedemo;

import java.util.ArrayList;
import java.util.HashSet;

public class CustomerMain {
	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		Customer c1 = new Customer(1, "Lakpa", "Plano, TX");
		Customer c2 = new Customer(2, "Menlaa", "Austin, TX");
		Customer c3 = new Customer(3, "Doma", "Houston, TX");
		Customer c4 = new Customer(4, "Neem", "Dallas, TX");
		Customer c5 = new Customer(4, "Neem", "Dallas, TX");
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		// doesn't store duplicates for primitive data types
		// but stores duplicate records in case of user defined objects like Employee, Customer etc.
		// to store only single record, equals() and hashCOde() methods are used in the Customer (model class)
		HashSet<Customer> set = new HashSet<Customer>(list);
		
		for (Customer c : set) {
			System.out.println(c);
		}
	}
}
