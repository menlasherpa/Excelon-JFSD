package app.day11;

public class ThrowsDemo {
	public static void main(String[] args) throws AgeException {
		int age = 2;
		
		if (age > 18) System.out.println("Can vote");
		else throw new AgeException("Lakpa", age);
	}
}
