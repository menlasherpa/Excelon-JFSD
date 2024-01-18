package app.day04.example.test;

import app.day04.example.Employee2;

public class Employee2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee2 e = new Employee2();
		e.setEmpId(101);
		e.setEmpName("Menlaa");
		e.setSalary(100000);
		
		System.out.println(e.getEmpId() + ", " + e.getEmpName() + ", " + e.getSalary());
	}

}
