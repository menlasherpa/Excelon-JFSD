package app.day04.example.test;

import app.day04.example.Address;
import app.day04.example.Person;

public class PersonTest {
	public static void main(String[] args) {
		Address permAddress = new Address("Plano", "Texas");
		Address tempAddress = new Address("Fairfield", "Iowa");
		Address localAddress = new Address("Jersey City", "New Jersey");
		
		Person p = new Person(101, "Menlaa", permAddress, tempAddress, localAddress);
		
		System.out.println(p);
	}
}
