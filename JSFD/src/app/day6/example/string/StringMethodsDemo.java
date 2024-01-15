package app.day6.example.string;

public class StringMethodsDemo {
	
	// static variable
	static int a = 5;
	
	public static void main(String[] args) {
		String str = "Lakpa Doma Sherpa";
		String str1 = "     Excelon        ";
		
		System.out.println(str.length());
		System.out.println(str.trim());
		
		// Class accessing static variable
		System.out.println(StringMethodsDemo.a);
		
		// static variable can also be accessed via object but not recommended
		StringMethodsDemo s = new StringMethodsDemo();
		System.out.println(s.a);
		
		// removes the white space from front and back
		System.out.println(str1.trim());
	}
}
