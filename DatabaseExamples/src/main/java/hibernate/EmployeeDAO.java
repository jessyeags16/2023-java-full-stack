package hibernate;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {
	// your DAO is all about asking info of the database
	// in update you use merge, insert uses save
	// this is proper CRUD, create, reading (finding),

	public Employee findById(Integer id) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM Employee e where e.id = :idParam";
		TypedQuery<Employee> query = session.createQuery(hql, Employee.class);
		query.setParameter("idParam", id);
		Employee result = query.getSingleResult(); // use get single result when you know you want 1 single record

		session.close();

		return result;

	}

	public void update(Employee employee) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		session.getTransaction().begin();
		session.merge(employee);
		session.getTransaction().commit();
		session.close();

	}

	public void delete(Employee employee) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		session.getTransaction().begin();
		session.delete(employee);
		session.getTransaction().commit();
		session.close();
	}

	public void insert(Employee employee) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		session.getTransaction().begin();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
	}

	public Employee findByContactFirstName(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Employee e where e.id = :idParam";

		TypedQuery<Employee> query = session.createQuery(hql, Employee.class);
		query.setParameter("idParam", id);

		Employee result = query.getSingleResult();

		session.close();

		return result;
	}

}
