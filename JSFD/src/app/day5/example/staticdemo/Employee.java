package app.day5.example.staticdemo;

public class Employee {
	
	// instance variable
	private int eId;
	private String eName;
	private double salary;
	
	// static variable
	private static String orgName = "Excelon";
	
	// anonymous block
	{
		System.out.println("Anonymous or no-name block - executes after each object creation");
	}

	public Employee(int eId, String eName, double salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}

	public static String getOrgName() {
		return orgName;
	}

	public static void setOrgName(String orgName) {
		Employee.orgName = orgName;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + "]";
	}
	
	
}
