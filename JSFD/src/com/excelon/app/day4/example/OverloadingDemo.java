package com.excelon.app.day4.example;

public class OverloadingDemo {
	public static void main(String[] args) {
		OverloadingDemo od= new OverloadingDemo();
		od.show(100);
		od.show(3,4);
		od.show(10.0, 20);
		od.show("Lakpa");
		
	}
	
	void show(int x) {
		System.out.println("Int value is " + x);
	}
	
	void show (int x, int y) {
		System.out.println("Int value x+y is " + x + y);
	}
	
	void show(double x, int y) {
		System.out.println("Int value x+y is " + x + y);
	}
	
	void show(String x) {
		System.out.println("String value is " + x);
	}

}
