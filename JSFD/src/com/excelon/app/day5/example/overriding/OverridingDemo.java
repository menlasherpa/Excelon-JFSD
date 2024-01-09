package com.excelon.app.day5.example.overriding;

import com.excelon.app.day5.example.C;

public class OverridingDemo {
	public static void main(String[] args) {
		
		// super class
		A a = new A();
		a.show();
		System.out.println(a.x);
		
		// sub class
		B b = new B();
		b.show();
		
		C c = new C();
		c.show();
		
		// subclass accessing instance variable of super class
		System.out.println(b.x);
		System.out.println(c.x);
		
	}
}
