package com.book.service;

import java.util.List;

import com.book.dto.BooksDTO;

public interface BookService {

	List<BooksDTO> getAllBooks();

	String deletebookById(Integer bookId);

	String addBook(BooksDTO bookDTO);

	String updatedBook(Integer bookId, BooksDTO bookDTO);

	

	

	

}