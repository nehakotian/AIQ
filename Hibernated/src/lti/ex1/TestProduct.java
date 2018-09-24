package lti.ex1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestProduct {
	@Test
	public void testAddProduct() {
		SessionFactory factory=HibernateUtil.getFactory();
		
		Session session=factory.getCurrentSession();
		Transaction txn=session.getTransaction();
		
		Product p1=new Product();
		p1.setName("Apple iPhone XR");
		p1.setPrice(73999.99);
		
		try {
			txn.begin();
			session.save(p1);
			txn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
		} finally {
			factory.close();
		}
		
	}
	
	@Test
	public void testFetchProduct() {
		SessionFactory factory=HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		Product p=(Product) session.get(Product.class, 2);
		System.out.println(p.getName()+": Rs."+p.getPrice());
		factory.close();
	}
	
	@Test
	public void testUpdateProduct() {
		SessionFactory factory=HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn=session.beginTransaction(); //Needed when we perform DML operation
		
		Product p=(Product) session.get(Product.class, 2);
		p.setPrice(119999.99); //Update in attached scenario
		txn.commit();
		
		factory.close();
	}
	
	@Test
	public void testDetachedUpdateProduct() {
		SessionFactory factory=HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		
		Transaction txn=session.beginTransaction();
		Product p=(Product) session.get(Product.class, 2);
		txn.commit();
		
		session = factory.getCurrentSession();
		txn=session.beginTransaction();
		p.setPrice(129999.99); //Update in detached scenario
		session.update(p);
		txn.commit();
		
		factory.close();
	}
	
	@Test
	public void testDeleteProduct() {
		SessionFactory factory=HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction txn=session.beginTransaction();
		
		Product p=(Product) session.get(Product.class, 2);
		session.delete(p);
		txn.commit();
		
		factory.close();
	}
	
	
}
