package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exception.EmployeeException;
import model.Employee;
import util.DbUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	private Connection con=DbUtil.getConnection();
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		List<Employee> employees=new ArrayList<Employee>();
		try {
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select * from employee");
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setAge(rs.getInt(3));
				//emp.setSalary(rs.getDouble("salary"));
				employees.add(emp);
			}
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		return employees;
	}
	@Override
	public int addEmployee(Employee employee) {
		int rowsAffected=0;
		try {
			PreparedStatement stat=con.prepareStatement("insert into Employee values(?,?,?)");
			stat.setInt(1, employee.getId());
			stat.setString(2, employee.getName());
			stat.setInt(3, employee.getAge());
			//stat.setDouble(4, employee.getSalary());
			rowsAffected=stat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage());
		}
		
		
		return rowsAffected;
	}

}
