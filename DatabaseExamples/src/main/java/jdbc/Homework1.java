package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
	// I want to see a list of all customers that have made a payment larger than <amount> in a particular <state>
	// Print the checkNumber, amount (formatted to $#.00 ), and the customer name ordered by the largest amount first
	// input variables for the scanner are 1) the amount and 2) 2 digit state code.



				String dburl = "jdbc:mysql://127.0.0.1:3306/classicmodels";
				String user = "root";
				String password = "Remmy1116!";

				System.out.println("-------- MySQL JDBC Connection Demo ------------");

				try {
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Enter amount: ");
					Integer amt = sc.nextInt();
					
					System.out.println("Enter 2 digit state code: ");
					String stateID = sc.next();
					
					// Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection(dburl, user, password);
					String SelectSQL = "select p.checkNumber, p.amount, c.customerName, c.state\r\n"
							+ "from payments p, customers c\r\n"
							+ "where c.customerNumber = p.customerNumber\r\n"
							+ "and p.amount > ? "
							+ "and c.state = ? "
							+ "order by p.amount desc; " ;

					

					PreparedStatement stmt = connection.prepareStatement(SelectSQL);
					stmt.setInt(1, amt); 
					stmt.setString(2, stateID);
					
					//DecimalFormat df = new DecimalFormat("$#.00");

					ResultSet result = stmt.executeQuery();
					while (result.next()) {
						String checkNumber = result.getString("checkNumber");
						String amount = result.getString("amount");
						String customerName = result.getString("customerName");
						String state = result.getString("state");
						System.out.println(checkNumber + ": " + amount + " | " + customerName + " | " + state);
					}
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

		}


