package com.sroba.model;

public class Book {

	private String id;
	private String bookName; 
	private String genre;
	private int yearCreation;
	
	public String getName() {
		return bookName;
	}
	
	public void setName(String name) {
		this.bookName = name;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getYearCreation() {
		return yearCreation;
	}
	
	public void setYearCreation(int yearCreation) {
		this.yearCreation = yearCreation;
	}
	
	public void showBookSummary(String bookName, String genre, int yearCreation) {	
		System.out.println("===================================");
		System.out.println("Book name: " + bookName);
		System.out.println("Genre: " + genre);
		System.out.println("Year Creation: " + yearCreation);
		System.out.println("===================================");
	}
}
