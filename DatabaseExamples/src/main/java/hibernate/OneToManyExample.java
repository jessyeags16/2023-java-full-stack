package hibernate;

public class OneToManyExample {

	public static void main(String[] args) {
		
		CustomerDAO customerDao = new CustomerDAO();
		EmployeeDAO  employeeDao = new EmployeeDAO();
		
		
		Employee e = employeeDao.findById(1166);
		System.out.println(e);
		
		for(Customer customer: e.getCustomers() ) {
			System.out.println(customer);
		}
		
		Customer customer = new Customer();
		customer.setCustomerName("Hibernate customer ");
		customer.setContactFirstname("First Name");
		customer.setContactLastname("Last Name");
		customer.setPhone("555-555-5555");
		customer.setAddressLine1("Address Line 1");
		customer.setCity("Indiana");
		customer.setState("PA");
		customer.setCountry("USA");
		customer.setEmployee(e); //you have to set the employee obj to the customer then you can add the customer to the employee and save it
		
		customerDao.insert(customer);
		
		//e.getCustomers().add(customer); //add to employee customer's lists
		//employeeDao.update(e); // save the employee
		//we could also add an employee to a customer here

	}

}
