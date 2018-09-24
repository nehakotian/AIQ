package lti.assignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class SongTest {
	@Test
	public void addSongs() 
	{
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		
		Genre genre = new Genre();
		genre.setGenreName("Reggaeton, Latin pop, Pop");
		
		
		Artist artist = new Artist();
		artist.setArtistName(" Luis Fonsi");
		
		Album album = new Album();
		album.setAlbumName(" Daddy K - The Mix 11");
		album.setArtist(artist);

		Song song = new Song();
		song.setSongName("Despacito");
		song.setAlbum(album);
		song.setArtist(artist);
		song.setGenre(genre);
		
		
		
		session.save(genre);
		session.save(artist);
		session.save(album);
		session.save(song);

		tx.commit();
		factory.close();
	}

	
}
