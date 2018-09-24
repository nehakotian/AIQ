package lti.ex7;

import java.util.Set;

import lti.ex7.Movie;

public class Movie {

	private int movieId;
	private String title;
	
	private Set<Characters> character;
	
	
	public Set<Characters> getCharacter() {
		return character;
	}
	public void setCharacter(Set<Characters> character) {
		this.character = character;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
