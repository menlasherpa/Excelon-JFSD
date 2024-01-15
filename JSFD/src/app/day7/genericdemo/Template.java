package app.day7.genericdemo;

// Generic Example
public class Template<T> {
	
	// T is any data types you want to keep
	private T a;
	
	// constructor
	public Template(T a) {
		super();
		this.a = a;
	}
	
	
	// getters and setters
	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}



	// just a normal method
	// T is the return type
	T showData(T a) {
		return a;
	}
}
