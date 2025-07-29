package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {
	List<Employee> getEmployee();
	int addEmployee(Employee employee);
}
