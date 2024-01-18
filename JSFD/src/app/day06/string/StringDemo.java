package app.day06.string;

public class StringDemo {
	public static void main(String[] args) {
		
		// stored in string cosntant pool
		String str1 = "Hello";
		String str2 = "Hello";
		
		// stored in heap as it is object
		String str3 = new String("Hello");
		
		System.out.println("Hashcode of str1 " + str1.hashCode());
		System.out.println("Hashcode of str2 " + str2.hashCode());
		System.out.println("Hashcode of str3 " + str3.hashCode());
		
		
		// if content is same whether it's strong literal or string object, hashcode will be same
		str3 = "Hello";
		System.out.println("Hashcode of str3 " + str3.hashCode());
		
		str3 = new String("Hello world");
		System.out.println("Hashcode of str3 " + str3.hashCode());
		
		str3 = "Hello there";
		System.out.println("Hashcode of str3 " + str3.hashCode());
		
		
		// equals() checks the content
		if (str1.equals(str2)) System.out.println("Str1 and str2 are equal");
		else System.out.println("str1 and str2 are not eqaul");
		
		
		// == checks the memory location whether in heap or pool (not the hashcode)
		if (str1 == str2) System.out.println("Str1 and str2 are equal");
		else System.out.println("str1 and str2 are not eqaul");
		

		if (str1.equals(str3)) System.out.println("Str1 and str3 are equal");
		else System.out.println("str1 and str3 are not eqaul");
		
		if (str1 == str3) System.out.println("Str1 and str3 are equal");
		else System.out.println("str1 and str3 are not eqaul");
		
		
	}
}
