package app.day5.example.staticdemo;

public class StaticDemo {
	
	// static block
	static {
		System.out.println("Static block - executes before main() function");
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Lakpa", 1000);
		Employee e2 = new Employee(102, "Menlaa", 10040);
		Employee e3 = new Employee(103, "Doma", 10200);
		Employee e4 = new Employee(104, "Sherpa", 10500);
		Employee e5 = new Employee(105, "Megha", 10020);
		
		// orgName is static variable so Employee class can directly access it and change it
		Employee.setOrgName("Technologies Hub");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
	}
}
