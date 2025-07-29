package service;

import java.util.List;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import model.Employee;

public  class EmployeeServiceImpl  implements EmployeeService{

	private EmployeeDao dao=new EmployeeDaoImpl();
	
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return dao.getEmployee();
	}

	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.addEmployee(employee);
	}

}
