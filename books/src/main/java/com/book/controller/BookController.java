package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.dto.BooksDTO;
import com.book.exception.ProductException;
import com.book.service.BookService;


@RestController
@Validated

@RequestMapping("/book")
public class BookController {

	@Autowired 
	BookService bookService;
	
@GetMapping
	
	public List<BooksDTO> getAllBooks ( )  {
		
		return  bookService.getAllBooks();
			}
	
@DeleteMapping("/{bookId}")

public String deleteBookById ( @PathVariable Integer bookId) throws ProductException  {
	
	return   bookService.deletebookById(bookId);
		}

@PostMapping

public ResponseEntity<String> getProductsById ( @RequestBody BooksDTO bookDTO)  {
	
	return  new ResponseEntity<>(bookService.addBook(bookDTO),HttpStatus.CREATED);
		}

@PutMapping ("/{bookId}")

public ResponseEntity<String> updateProductsById ( @PathVariable Integer bookId, @RequestBody BooksDTO bookDTO)  {
	
	return  new ResponseEntity<>(bookService.updatedBook(bookId, bookDTO),HttpStatus.CREATED);
		}
}
