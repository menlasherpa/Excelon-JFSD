package app.day11.io.objectreadwritedemo;

import java.io.Serializable;
import java.time.LocalDate;

// we did implement Serializable so as to allow ObjectStream to read and write objects into the file
public class Employee implements Serializable{
	
	private int empNo;
	private String name;
	private LocalDate date;
	
	private transient String description;

	public Employee(int empNo, String name, LocalDate date, String description) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.date = date;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", date=" + date + "]";
	}
	
}
