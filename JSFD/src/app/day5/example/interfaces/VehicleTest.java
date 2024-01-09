package app.day5.example.interfaces;

public class VehicleTest {
	public static void main(String[] args) {
		
		// interface accessing its static methods and variables
		Vehicle.show();
		System.out.println(Vehicle.PI);
		
		Car car = new Car();
		car.drive();
		car.show();
		
		// Vehicle interface cannot be instantiated but we can instantiate Car class and store in Vehicle reference variable
		Vehicle v = new Car();
		v.drive();
	}
}
