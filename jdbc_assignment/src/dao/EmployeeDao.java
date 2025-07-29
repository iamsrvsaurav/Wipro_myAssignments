package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDao {

	List<Employee> getEmployee();
	int addEmployee(Employee employee);
}
