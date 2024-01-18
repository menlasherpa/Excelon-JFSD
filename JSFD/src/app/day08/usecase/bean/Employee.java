package app.day08.usecase.bean;

// Java bean or POJO class
public class Employee {
	
	// private variables
	private int empId;
	private String name;
	private double salary;
	private String email;
	
	// public constructor
	public Employee(int empId, String name, double salary, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}
	
	public Employee() {
		
	}
	
	// getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", email=" + email + "]";
	}
	
	

}
