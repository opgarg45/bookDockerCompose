package com.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.book.dto.BooksDTO;
import com.book.entity.Books;
import com.book.repository.BooksRepository;

@Service
@PropertySource("classpath:messages.properties")

public class BookServiceImpl implements BookService {

	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}

	@Autowired

	private BooksRepository booksRepo;

	@Override
	public List<BooksDTO> getAllBooks() {

		List<Books> bookList = booksRepo.findAll();
		List<BooksDTO> booksDTOList = new ArrayList<>();

		bookList.parallelStream().forEach(book -> {

			booksDTOList.add(BooksDTO.prepareDTO(book));

		});
		return booksDTOList;
	}

	@Override
	public String deletebookById(Integer bookId) {
		Optional<Books> book = booksRepo.findById(bookId);

		booksRepo.delete(book.get());
		return "Book Deleted Successfully " + book.get().getBookId();
	}

	@Override
	public String addBook(BooksDTO bookDTO) {

		Books book = BooksDTO.prepareEntity(bookDTO);
		booksRepo.save(book);

		return "Book Added Succesfully";
	}

	@Override
	public String updatedBook(Integer bookId, BooksDTO bookDTO) {
		Optional<Books> books = booksRepo.findById(bookId);

		Books book = BooksDTO.prepareEntity(bookDTO);
		book.setBookId(books.get().getBookId());
		booksRepo.save(book);
		return "Book updated Successfully";
	}

}
