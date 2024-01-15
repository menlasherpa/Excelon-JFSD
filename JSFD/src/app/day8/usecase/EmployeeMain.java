package app.day8.usecase;

import java.util.ArrayList;
import java.util.Scanner;

import app.day8.usecase.bean.Employee;
import app.day8.usecase.service.EmployeeService;

public class EmployeeMain {
	
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Scanner s = new Scanner(System.in);
		
		// to continuously show the menus unless exited by typing option 0
		while (true) {
			System.out.println();
			System.out.println("Option menus:");
			System.out.println("Enter 1 to insert record");
			System.out.println("Enter 2 to view record");
			System.out.println("Enter 3 to update record");
			System.out.println("Enter 4 to remove record");
			System.out.println("Enter 0 to exit");
			System.out.println();
			
			
			System.out.println("Enter an option");
			int option = s.nextInt();
			
			EmployeeService es = new EmployeeService();
			
			switch(option) {
				case 1:
					empList = es.insertEmployee(empList);
					break;
				case 2:
					es.viewEmployees(empList);
					break;
				case 3:
					empList = es.updateEmployees(empList);
					break;
				case 4:
					es.deleteEmployee(empList);
					break;
				case 0:
					System.out.println("You have exited the menus. Run the program again to see the menus.");
					System.exit(0);
				default:
					System.out.println("Inavlid option");
					break;
			}
		}
		
	}

}
