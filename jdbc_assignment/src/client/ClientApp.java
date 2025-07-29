package client;

import java.util.List;
import java.util.Scanner;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class ClientApp {
	private static Scanner sc=new Scanner(System.in);
	private static EmployeeService service=new EmployeeServiceImpl();
	public static void main(String[] args) {
		
		System.out.println("1. Add Employee");
		System.out.println("2. Get All Employees");
		System.out.println("3: Exit");
		int choice=sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			addEmployee();
			break;
		case 2:
			displayEmployees();
			break;
		case 3:
			System.exit(choice);
		default:
			break;
		}

	}
	
	public static void addEmployee() {
		System.out.println("Enter Employee Id");
		Employee emp=new Employee();
		emp.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Name");
		emp.setName(sc.nextLine());
		System.out.println("Enter Age");
		emp.setAge(sc.nextInt());
		/*System.out.println("Enter Salary");
		emp.setSalary(sc.nextDouble());*/
		service.addEmployee(emp);
		System.out.println("Employee with the id "+emp.getId()+" added successfully");
		
	}
	
	public static void displayEmployees() {
		List<Employee> employees=service.getEmployee();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
