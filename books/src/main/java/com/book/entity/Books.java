package com.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(name = "BookSeq", initialValue = 1)
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "BookSeq")
	@Column(name = "bookId")
	private int bookId;

	@Column(name = "bookName")
	private String bookName;

	
	@Column(name = "description")
	private String description;

	@Column(name = "author")
	private String author;

	@Column(name = "price")
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	


}
