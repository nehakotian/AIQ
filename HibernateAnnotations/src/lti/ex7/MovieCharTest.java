package lti.ex7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.ex7.Movie;
import lti.ex7.Characters;
import lti.util.HibernateUtil;

public class MovieCharTest {

	@Test
	public void testCase1() {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		Movie mo = new Movie();
		mo.setMovieId(11335);
		mo.setTitle("ABCDE");
		
		
		session.save(mo);
		tx.commit();
	}
	
	@Test
	public void testCase2() {
		SessionFactory factory =  HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		Movie movie = (Movie) session.get(Movie.class, 11335);
		
		Characters character = new Characters();
		character.setCharacterId(2);
		character.setName("Vinduja");
		character.setMovie(movie);
		session.save(character);
		tx.commit();
	}
	
	
}
