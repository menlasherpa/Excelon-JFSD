package com.excelon.app.day5.example.abstractdemo;

public class AbstractDemo {
	
	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		Television tv = new Television();
		tv.on();
		tv.off();
		tv.monitor();
		
		// subclass Television accessing its own methods as well as of super class
		tv.display();
		tv.show();
		tv.view();
		
		Remote r = new Television();
		
		// super class can access only its methods, cannot access sub class methods
		r.on();
		r.off();
		r.display();
		r.show();
		r.view();
	}
}
