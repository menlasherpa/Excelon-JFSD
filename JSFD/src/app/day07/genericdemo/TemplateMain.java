package app.day07.genericdemo;

public class TemplateMain {
	public static void main(String[] args) {
		
		Template<Integer> t1 = new Template<>(129);
		
		// displaying data via constructor and getter method
		System.out.println(t1.getA());
		
		// displaying via showData() method
		System.out.println(t1.showData(100));
		
		
		
		
		Template<String> t2 = new Template<>("Lakpa");
		
		// displaying data via constructor and getter method
		System.out.println(t2.getA());
		
		// displaying via showData() method
		System.out.println(t2.showData("Hi there!"));
	}
}
