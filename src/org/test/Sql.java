package org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sql {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("Oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","hr", "admin");
		String s="Select * from employees";
		PreparedStatement prepareStatement = connection.prepareStatement(s);
		ResultSet rs = prepareStatement.executeQuery();
		while(rs.next()) {
			String string = rs.getString("First_name");
			System.out.println(string);
		}
			connection.close();
		
		
	}

}
