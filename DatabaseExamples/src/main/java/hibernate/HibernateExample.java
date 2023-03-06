package hibernate;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateExample {

	public static void main(String[] args) {
		CustomerDAO customerDao = new CustomerDAO();

		// we don't set the ID column bc hibernate/mySQL will automatically generate for
		// us.
		Customer customer = new Customer();
		customer.setCustomerName("Hibernate customer ");
		customer.setContactFirstname("First Name");
		customer.setContactLastname("Last Name");
		customer.setPhone("555-555-5555");
		customer.setAddressLine1("Address Line 1");
		customer.setCity("Indiana");
		customer.setState("PA");
		customer.setCountry("USA");
		customerDao.insert(customer);
		
		// he.insert()

		Customer first = customerDao.findById(103);
		System.out.println(first.toString());

		first.setAddressLine1("this is an update");
		first.setCreditLimit(1000000.35);

		customerDao.updateCustomer(first);
		//customerDao.delete(first);

		// List<Customer> firstNames = he.findByContactFirstName("Leslie");
		// for (Customer c : firstNames) {
		// System.out.println(c);
	}

}