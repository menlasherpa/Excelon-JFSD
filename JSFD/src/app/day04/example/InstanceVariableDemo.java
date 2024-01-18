package app.day04.example;

public class InstanceVariableDemo {
	
	// instance variables
	int x = 101;
	String name = "Menlaa";
	
	
	// default constructor
	public InstanceVariableDemo() {
		System.out.println("Default constructor.....");
	}
	
	// instance method
	void show() {
		System.out.println("Instance method..........");
	}
	
	// static method
	static void display() {
		System.out.println("Static method...........");
	}


	public static void main(String[] args) {
		
		// to use instance variable and methods, we need object
		InstanceVariableDemo id = new InstanceVariableDemo();
		InstanceVariableDemo id1 = new InstanceVariableDemo();
		id.show();
		System.out.println("Number " + id.x);
		id.x = 102;
		System.out.println("Number with id object " + id.x);
		System.out.println("Number with id1 object " + id1.x);
		System.out.println("Name " + id.name);
		
		display();
	}
	
}
