package com.book.dto;

import com.book.entity.Books;

public class BooksDTO {
	
	
	private int bookId;
	

	private String bookName;
	
	
	private String author ;
	
	
	private String description;
	
	
	
	
	int price;
	
	

	
	
	

	public int getBookId() {
		return bookId;
	}







	public void setBookId(int bookId) {
		this.bookId = bookId;
	}







	public String getBookName() {
		return bookName;
	}







	public void setBookName(String bookName) {
		this.bookName = bookName;
	}







	public String getAuthor() {
		return author;
	}







	public void setAuthor(String author) {
		this.author = author;
	}







	public String getDescription() {
		return description;
	}







	public void setDescription(String description) {
		this.description = description;
	}







	public int getPrice() {
		return price;
	}







	public void setPrice(int price) {
		this.price = price;
	}







	public static BooksDTO prepareDTO(Books books) {
		BooksDTO booksDTO = new BooksDTO();
		booksDTO.setDescription(books.getDescription());
		//booksDTO.setImageURL(books.getImageURL());
		booksDTO.setAuthor(books.getAuthor());
		booksDTO.setBookId(books.getBookId());
		booksDTO.setBookName(books.getBookName());
	
		return booksDTO	;
	}







	public static Books prepareEntity(BooksDTO booksDTO) {
		Books book = new Books();
		book.setDescription(booksDTO.getDescription());
		//booksDTO.setImageURL(books.getImageURL());
		book.setAuthor(booksDTO.getAuthor());
		book.setBookId(booksDTO.getBookId());
		book.setBookName(booksDTO.getBookName());
	
		return book	;
	}
}
