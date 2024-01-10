package app.day6.example.string;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		// string buffer is mutable
		StringBuffer str = new StringBuffer("Hello");
		
		System.out.println(str);
		System.out.println("Hashcode of str is " + str.hashCode());
		
		str.append(" world");
		
		System.out.println("==================");
		
		System.out.println(str);
		System.out.println("Hashcode of str is " + str.hashCode());
	}
	
	
	
}
