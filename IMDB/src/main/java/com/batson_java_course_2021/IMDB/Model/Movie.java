package com.batson_java_course_2021.IMDB.Model;

import java.util.Date;

public class Movie {

	// MEM VARS
	private long id;
	private String title;
	private String genre;
	private Date releaseDate;
	private String person;

	public Movie(String title, String genre, Date releaseDate, String person, int id) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.person = person;
	}

	public Movie(int id, String title) {

	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		return;
	}

}
