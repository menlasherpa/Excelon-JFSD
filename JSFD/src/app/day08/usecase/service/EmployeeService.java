package app.day08.usecase.service;

import java.util.ArrayList;
import java.util.Scanner;

import app.day08.usecase.bean.Employee;

public class EmployeeService {
	
	Scanner s = new Scanner(System.in);
	Employee e = new Employee();

	public ArrayList<Employee> insertEmployee(ArrayList<Employee> list) {
		System.out.println("Enter employee ID");
		int id = s.nextInt();
		e.setEmpId(id);
		s.nextLine();
		
		System.out.println("Enter emmployee name");
		String name = s.nextLine();
		e.setName(name);
		
		System.out.println("Enter employee salary");
		double salary = s.nextDouble();
		e.setSalary(salary);
		s.nextLine();
		
		System.out.println("Enter employee email");
		String email = s.nextLine();
		e.setEmail(email);
		
		list.add(e);
		
		return list;
		
	}
	
	public void viewEmployees(ArrayList<Employee> list) {
		if (list.isEmpty()) System.out.println("No employee records");
		else {
			System.out.println("There are total " + list.size() + " employee records in file");
			for (Employee e : list) {
				System.out.println(e.toString());
			}
		}
	}
	
	public void deleteEmployee(ArrayList<Employee> list) {
		if (list.size() == 0) {
			System.out.println("There are no emplpyee records. Please insert records first!");
		} else {
			System.out.println("Enter the index number of employee record you want to delete");
			int index = s.nextInt();

			if (index >= list.size()) System.out.println("Index is out of bound. Please enter the index number between 0 and " + (list.size()-1));
			else {
				list.remove(index);
				System.out.println("Employee record of Index " + index + " has been successfully deleted!");
			}
		}
		
	}
	
	public ArrayList<Employee> updateEmployees(ArrayList<Employee> list) {
		System.out.println("Enter the index number of employee record you want to update.");
		int index = s.nextInt();
		
		System.out.println("Now");
		System.out.println("Enter employee ID");
		int id = s.nextInt();
		e.setEmpId(id);
		
		s.nextLine();
		System.out.println("Enter emmployee name");
		String name = s.nextLine();
		e.setName(name);
		
		System.out.println("Enter employee salary");
		double salary = s.nextDouble();
		e.setSalary(salary);
		
		s.nextLine();
		System.out.println("Enter employee email");
		String email = s.nextLine();
		e.setEmail(email);
		
		list.set(index, e);
		
		return list;
	}
}
