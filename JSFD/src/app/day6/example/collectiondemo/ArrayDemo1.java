package app.day6.example.collectiondemo;

import java.util.ArrayList;

import app.day6.example.collectiondemo.model.Employee;

public class ArrayDemo1 {
	public static void main(String[] args) {
		
		ArrayList<Employee> arrList = new ArrayList<Employee>();
		
		Employee e1 = new Employee(101, "Lakpa", 10000);
		Employee e2 = new Employee(102, "Doma", 100034540);
		Employee e3 = new Employee(103, "Sherpa", 1003400);
		Employee e4 = new Employee(104, "Menlaa", 1350000);
		Employee e5 = new Employee(105, "Lakpa", 1006400);
		
		arrList.add(e1);
		arrList.add(e2);
		arrList.add(e3);
		arrList.add(e4);
		arrList.add(e5);
		
		for (Employee e : arrList) {
			System.out.println(e);
		}
		
	}

}
