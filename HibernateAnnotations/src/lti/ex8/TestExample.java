package lti.ex8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.ex8.Bid;
import lti.ex8.Category;
import lti.ex8.Customer;
import lti.ex8.Item;
import lti.util.HibernateUtil;
public class TestExample {
	@Test
	public void addCustomers() 
	{
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Customer c1 = new Customer();
		c1.setName("Majrul");
		Customer c2 = new Customer();
		c2.setName("Zubair");
		session.save(c1);
		session.save(c2);
		tx.commit();
		factory.close();
	}

	@Test
	public void addCategories() 
	{
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
			Transaction tx = session.beginTransaction();
			Category c = new Category();
			c.setName("Mobiles");
			session.save(c);
			c = new Category();
			c.setName("Laptops");
			session.save(c);
			tx.commit();
			factory.close();
	}
	
	@Test
	public void addItems() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
			Transaction tx = session.beginTransaction();
			Item i = new Item();
			i.setName("Nokia 6600");
			i.setInitialPrice(4500);
			session.save(i);
			i = new Item();
			i.setName("Apple Macbook");
			i.setInitialPrice(55000);
			session.save(i);
			tx.commit();
			factory.close();
	}
	
	@Test
	public void linkItemToCategory() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Category c = (Category) session.get(Category.class, 1); //Mobiles category
		Item i = (Item) session.get(Item.class, 1); //Nokia mobile phone
		//make sure item-categories association is lazy=false
		i.getCategories().add(c);
		session.update(i);
		tx.commit();
		factory.close();
	}
	
	@Test
	public void placeABid() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Customer c = (Customer) session.get(Customer.class, 1); //Majrul
		Item i = (Item) session.get(Item.class, 1); //Nokia mobile phone
		Bid b = new Bid();
		b.setAmount(5000);
		b.setCustomer(c);
		b.setItem(i);
		session.save(b);
		tx.commit();
		factory.close();
	}
}
