package app.day05.example.abstractdemo;

public abstract class Remote {
	
	// abstract methods
	// abstract can only be on instance methods
	public abstract void on();
	public abstract void off();
	
	// constructor
	public Remote() {
		System.out.println("Remote constructor....");
	}
	
	// static method
	public static void show() {
		System.out.println("show() - static method");
	}
	
	// instance method
	public void display() {
		System.out.println("display() - instance method");
	}
	
	// final method
	public final void view() {
		System.out.println("view() - final method");
	}
}
