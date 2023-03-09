package hibernate;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PaymentDAO {

	public void update(Payment payment) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		session.getTransaction().begin();
		session.merge(payment);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(Payment payment) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		session.getTransaction().begin();
		session.delete(payment);
		session.getTransaction().commit();
		session.close();
	}

	public void insert(Payment payment) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		session.getTransaction().begin();
		session.save(payment);
		session.getTransaction().commit();
		session.close();
	}

	public Payment findById(Integer id) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Payment p where p.id = :idParam";
		TypedQuery<Payment> query = session.createQuery(hql, Payment.class);
		query.setParameter("idParam", id);
		Payment result = query.getSingleResult(); // use get single result when you know you want 1 single record

		session.close();

		return result;
	}
//my attempt at the homework.. I think my query is wrong or I should be passing in another parameter for customerId.. 
	public List<Payment> printPayments(Integer customerId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Payment p where p.id = :idParam";

		TypedQuery<Payment> query = session.createQuery(hql, Payment.class);
		query.setParameter("idParam", customerId);
		List<Payment> result = query.getResultList(); // use get single result when you know you want 1 single record

		session.close();

		return result;
	}

}
