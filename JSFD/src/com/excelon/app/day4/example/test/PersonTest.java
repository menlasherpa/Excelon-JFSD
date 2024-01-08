package com.excelon.app.day4.example.test;

import com.excelon.app.day4.example.Address;
import com.excelon.app.day4.example.Person;

public class PersonTest {
	public static void main(String[] args) {
		Address permAddress = new Address("Plano", "Texas");
		Address tempAddress = new Address("Fairfield", "Iowa");
		Address localAddress = new Address("Jersey City", "New Jersey");
		
		Person p = new Person(101, "Menlaa", permAddress, tempAddress, localAddress);
		
		System.out.println(p);
	}
}
