package lti.ex4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestPerson {

	@Test
	public void testSavePerson() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		Person p = new Person(new Person.Id("US", 12354), "Lili", 22);
		session.save(p);
		
		tx.commit();
	}
}
