package com.example.canspring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.canspring.dto.BookRequest;
import com.example.canspring.entity.Book;
import com.example.canspring.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book saveBook(BookRequest bookRequest) {
        Book book = new Book();
        book.setTitle(bookRequest.getTitle());
        book.setAuthor(bookRequest.getAuthor());
        book.setDescription(bookRequest.getDescription());
        book.setFile_name(bookRequest.getFile_name());
        book.setFile_url(bookRequest.getFile_url());
        book.setFile_size(bookRequest.getFile_size());
        book.setContent_type(bookRequest.getContent_type());
        return bookRepository.save(book);
    }
}
