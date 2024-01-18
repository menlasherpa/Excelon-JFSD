package app.day01.example;

public class DataType {
	// no static variable. We cannot directly run them. To run them, we need to create object and run via them
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char ch;
	boolean bl;
	
	public static void main(String[] args) {
		DataType dt = new DataType();
		System.out.println(dt.b);
		System.out.println(dt.s);
		System.out.println(dt.i);
		System.out.println(dt.l);
		System.out.println(dt.f);
		System.out.println(dt.d);
		System.out.println(dt.ch);
		System.out.println(dt.bl);
	}

}
