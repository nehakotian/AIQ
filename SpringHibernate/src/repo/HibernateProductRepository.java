package repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import entity.Product;

@Repository
public class HibernateProductRepository implements ProductRepository {

	//PROGAMATIC TRANSACTION-------------------------------------------------------------------------------------
	/*@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public void add(Product product) {
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(product);
		txn.commit();

	}

	@Override
	public Product get(int productId) {
		Session session = sessionFactory.openSession();
		Product product = (Product) session.get(Product.class, productId);
		return product;
	}

	@Override
	public List<Product> getAll() {
		Session session = sessionFactory.openSession();
		List<Product> products = session.createQuery("from Product").list();
		return products;
	}
*/
	
	//DECLARARTIVE TRANSACTION/CMT---------------------------------------------------------------------------------------
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void add(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.save(product);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public Product get(int productId) {
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, productId);
		return product;
	}

	@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.READ_COMMITTED)//here we are reading committed data only
	@Override
	public List<Product> getAll() {
		Session session = sessionFactory.getCurrentSession();
		List<Product> products = session.createQuery("from Product").list();
		return products;
	}

}
