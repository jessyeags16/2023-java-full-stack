package hibernate;

import java.util.Calendar;
import java.util.Date;

public class HibernateExample {

	public static void main(String[] args) {
		CustomerDAO customerDao = new CustomerDAO();
		PaymentDAO paymentDao = new PaymentDAO();
		OrderDAO orderDao = new OrderDAO();

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

		// Customer first = customerDao.findById(103);
		// System.out.println(first.toString());

		// first.setAddressLine1("this is an update");
		// first.setCreditLimit(1000000.35);

		// customerDao.updateCustomer(first);
		// customerDao.delete(first);

		// List<Customer> firstNames = he.findByContactFirstName("Leslie");
		// for (Customer c : firstNames) {
		// System.out.println(c);

		Payment p = new Payment();
		p.setAmount(5000.00);
		p.setPaymentDate(new Date());
		p.setCheckNumber("12345");

		customer.getPayments().add(p);
		customerDao.update(customer);

		
		//making a new order
		Order o = new Order();
		o.setOrderDate(new Date());
		//using a calendar function to set time
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 5);
		Date fiveDays = cal.getTime();
		o.setShippedDate(fiveDays);
		//using a calendar function to set time 
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(new Date());
		cal1.add(Calendar.DATE, -2);
		Date twoDays = cal1.getTime();
		o.setRequiredDate(twoDays);
		//other variables 
		o.setStatus("Shipped");
		o.setComments("invoice paid");
		//insert into order table 
		orderDao.insert(o);
		
		
		
		
	
		
		
		
		


}
}