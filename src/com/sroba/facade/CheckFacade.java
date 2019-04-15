package com.sroba.facade;

import com.sroba.model.Author;
import com.sroba.model.Book;

public class CheckFacade {
	
	private Author autor;
	private Book book;
	
	public CheckFacade() {
		autor = new Author();
		book = new Book();
	}
	
	public void buscarBook(String bookName, String autorName, String genre, int yearCreation) {
		book.showBookSummary(bookName, genre, yearCreation);
		autor.showAuthorSummary(autorName);
	}
}
