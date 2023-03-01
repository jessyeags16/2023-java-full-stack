package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BasicJDBCExamples {

	public static void main(String[] args) {
		String dburl = "jdbc:mysql://127.0.0.1:3306/classicmodels";
		String user = "root";
		String password = "Remmy1116!";

		System.out.println("-------- MySQL JDBC Connection Demo ------------");

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a first name or a last name: ");
			String name = sc.next();
			
			// Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dburl, user, password);
			String SelectSQL = "Select * FROM employees where firstName = ? or lastName = ?";

			//String firstName = "Steve";

			PreparedStatement stmt = connection.prepareStatement(SelectSQL);
			stmt.setString(1, name); // 1 because this is one based not zero based. THis is is saying hey, the
			stmt.setString(2, name);							 // first ?, put leslie

			ResultSet result = stmt.executeQuery();
			while (result.next()) {
				String EmployeeID = result.getString("employeeNumber");
				String fname = result.getString("firstName");
				String lname = result.getString("lastName");
				String email = result.getString("Email");
				System.out.println(EmployeeID + " | " + fname + " | " + lname + " | " + email);
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
