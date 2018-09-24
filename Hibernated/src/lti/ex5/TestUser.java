package lti.ex5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

import org.hibernate.Hibernate;

public class TestUser {

	
	@Test
	public void testCase1() {
		SessionFactory factory=HibernateUtil.getFactory();
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		User u=new User();
		u.setFirstname("Polo");
		u.setLastname("Mint");
		u.setUsername("polo");
		u.setPassword("polo123");
		
		Address address=new Address();
		address.setCity("Mumbai");
		address.setStreet("Powai");
		address.setZipcode("400083");
		
		u.setAddress(address);//bidirectional- save address details in user
		address.setUser(u);//bidirectional- save user details in address
		
		session.save(u);
		tx.commit();
	}
}
