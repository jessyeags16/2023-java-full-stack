package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//a list of all customers that have made a payment larger than <amount>
//print the checkNumber (formatted to be $#.00) and the customer name ordered by the largest amount first 
//input variables for the scanner are 1) the amount and 2) 2 digit state code 
public class AggregateJDBCExample {

	public static void main(String[] args) {
		String dburl = "jdbc:mysql://127.0.0.1:3306/classicmodels";
		String user = "root";
		String password = "Remmy1116!";

		System.out.println("-------- MySQL JDBC Connection Demo ------------");

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter an amount: ");
			Integer amount = sc.nextInt();
			
			// Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dburl, user, password);
			String SelectSQL = "select c.customerNumber, c.customerName, "
					+ "avg((MSRP - buyPrice)*quantityOrdered) as avg_margin "
					+ "from orders o, orderdetails od, products p, customers c "
					+ "where o.orderNumber = od.orderNumber "
					+ "and od.productCode = p.productCode "
					+ "and o.customerNumber = c.customerNumber "
					+ "group by c.customerNumber "
					+ "having avg((MSRP - buyPrice)*quantityOrdered) > ? "
					+ "order by avg_margin desc; " ;

			PreparedStatement stmt = connection.prepareStatement(SelectSQL);
			stmt.setInt(1, amount); // 1 because this is one based not zero based. THis is is saying hey, the
			
			ResultSet result = stmt.executeQuery();
			
			while (result.next()) {
				String customerNumber = result.getString("customerNumber");
				String customerName = result.getString("customerName");
				String averageMargin = result.getString("avg_margin");
				System.out.println(customerNumber + ": " + customerName + " " + averageMargin);
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}