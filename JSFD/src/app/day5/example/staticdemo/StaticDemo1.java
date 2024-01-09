package app.day5.example.staticdemo;

class Demo {

	// instance variable (personal variable for each object)
	int a = 10;
	
	// static variable (same for all objects)
	static int b = 20;
	
	// instance method, accessed only via objects
	void increment() {
		a++;
		b++;
		System.out.println("a = " + a + " and b = " + b);
	}
}
	
public class StaticDemo1 {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.increment();
		
		Demo d2 = new Demo();
		d2.increment();
		d2.increment();
		
		Demo d3 = new Demo();
		d3.increment();
	}
}

