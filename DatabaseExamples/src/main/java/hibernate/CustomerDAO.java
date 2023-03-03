package hibernate;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustomerDAO {
	// your DAO is all about asking info of the database
	//in update you use merge, insert uses save 
	//this is proper CRUD, create, reading (finding), 

	public void updateCustomer(Customer customer) {
		// this is boiler plate code, it will all stay the same except it'll be an
		// employee passed in and merge employee
		// springboot does for us
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(customer);
		session.getTransaction().commit();
		session.close();

	}

	public List<Customer> findByContactFirstName(String name) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Customer c where c.contactFirstname = :firstname";

		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		query.setParameter("firstname", name);

		List<Customer> result = query.getResultList(); // get result list because I want a list returned

		session.close();

		return result;

	}

	public Customer findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// aka JPA//very close to SQL but different, notice Customer below is the java
		// object
		// and c.id is actually refering to .id in the Customer.java class
		// notice where idParam matches the query.setParameter
		String hql = "FROM Customer c where c.id = :idParam";
		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		query.setParameter("idParam", id);
		Customer result = query.getSingleResult(); // use get single result when you know you want 1 single record

		session.close();

		return result;

	}
	
	public void delete(Customer customer) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(customer);
		session.getTransaction().commit();
		session.close();
	}

	public void insert(Customer customer) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		session.getTransaction().begin();
		session.save(customer);
		session.getTransaction().commit();
		session.close();
	}

}
