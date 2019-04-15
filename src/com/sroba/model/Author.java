package com.sroba.model;

public class Author {
	
	private String id;
	private String authorName; 
	private int years;
	private int birthDate;
	private int deadDate;
	
	public String getName() {
		return authorName;
	}

	public void setName(String name) {
		this.authorName = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public int getDeadDate() {
		return deadDate;
	}

	public void setDeadDate(int deadDate) {
		this.deadDate = deadDate;
	}

	public void showAuthorSummary(String authorName) {	
		System.out.println("===================================");
		System.out.println("Autor name: " + authorName);
		System.out.println("===================================");
	}
}
