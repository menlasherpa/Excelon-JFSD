package com.excelon.app.day5.example.interfaces;

public class Car implements Vehicle {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
		System.out.println("Drive() method - implemented from Vehicle Interface to Car class");
	}
	
	// instance method
	public void show() {
		System.out.println("show() - Car class method");
	}

}
