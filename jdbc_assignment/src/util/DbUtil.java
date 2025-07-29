package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import exception.EmployeeException;

public class DbUtil {
	
	public static Connection getConnection() {
		
		String url="jdbc:mysql://localhost:3306/sauravdb";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,"root","Saurav");
			return con;
		} catch (ClassNotFoundException e) {
			throw new EmployeeException(e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage());
		}
		
	}

}
