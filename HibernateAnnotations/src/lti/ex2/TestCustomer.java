package lti.ex2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestCustomer {

	@Test
	public void testAddCustomer() {
		SessionFactory factory=HibernateUtil.getFactory();
		
		Session session=factory.getCurrentSession();
		Transaction txn=session.getTransaction();
		
		Customer c1=new Customer();
		c1.setName("Priya");
		c1.setCreditLimit(112000);
		
		try {
			txn.begin();
			session.save(c1);
			txn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
		} finally {
			factory.close();
		}
		
	}
	
	@Test
	public void testFetchCustomer() {
		SessionFactory factory=HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		Customer c=(Customer) session.get(Customer.class, 1);
		System.out.println(c.getName()+": Limit: "+c.getCreditLimit());
		factory.close();
	}
	
	@Test
	public void testUpdateCustomer() {
		SessionFactory factory=HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn=session.beginTransaction(); //Needed when we perform DML operation
		
		Customer c=(Customer) session.get(Customer.class, 1);
		c.setCreditLimit(20000.99); //Update in attached scenario
		txn.commit();
		
		factory.close();
	}
	
	@Test
	public void testDeleteCustomer() {
		SessionFactory factory=HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn=session.beginTransaction();
		
		Customer c=(Customer) session.get(Customer.class, 1);
		session.delete(c);
		txn.commit();
		
		factory.close();
	}
}
