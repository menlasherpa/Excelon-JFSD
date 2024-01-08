package com.excelon.app.day4.example;

public class Person {
	
	private int personId;
	private String name;
	private Address permAdd, tempAdd, localAdd;
	
	// argument constructor
	public Person(int personId, String name, Address permAdd, Address tempAdd, Address localAdd) {
		super();
		this.personId = personId;
		this.name = name;
		this.permAdd = permAdd;
		this.localAdd = localAdd;
		this.tempAdd = tempAdd;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", permAdd=" + permAdd + ", tempAdd=" + tempAdd
				+ ", localAdd=" + localAdd + "]";
	}
	
}
