package app.day05.example.overriding;

public class B extends A{
	
	@Override
	public void show() {
		
		// displays show() method of super class (Class A)
		super.show();
		
		System.out.println("show() method - Class B");
	}
}
