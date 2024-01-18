package app.day05.example.interfaces;

public interface Vehicle {
	
	// variables are automatically public static final
	double PI = 3.14;
	
	// methods are automatically public abstract in interface
	// there can be only abstract methods
	void drive();
	
	// there can be static methods with implementation in interface, but they cannot be overridden
	public static void show() {
		System.out.println("show() - static method");
	}
}
