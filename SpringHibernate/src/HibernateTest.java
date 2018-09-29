import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import entity.Product;
import repo.ProductRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:appctx.xml")
public class HibernateTest {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Test
	public void testHibernate() {
		Product p = new Product(); 
		p.setName("Macbook");
		p.setPrice(25000.0);
		productRepository.add(p);//
	}

	@Test
	public void testHibernateGet() {
		Product p = productRepository.get(301);	
		System.out.println("Code: " + p.getCode() + " Name: " +p.getName() + " Price: " + p.getPrice());
	} 
	
	@Test
	public void testHibernateGetAll() {
		List<Product> products = productRepository.getAll();
		for (Product product : products) {
			System.out.println("Code: " + product.getCode() + " Name: " +product.getName() + " Price: " + product.getPrice());
		}
		
	}
}
