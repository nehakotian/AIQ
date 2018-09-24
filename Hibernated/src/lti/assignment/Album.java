package lti.assignment;

import java.util.HashSet;
import java.util.Set;
import lti.assignment.Song;
import lti.assignment.Album;

public class Album {
	private int albumId;
	private String albumName;
	
	private Set<Song> songs;
	
	private Artist artist;
	
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public Set<Song> getSongs() {
		return songs == null ? new HashSet<Song>() : songs;
	}
	public void setSongs(Set<Song> songs) {
		this.songs = songs;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
}
