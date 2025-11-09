package com.example.canspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.canspring.dto.BookRequest;
import com.example.canspring.entity.Book;
import com.example.canspring.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody BookRequest bookRequest) {
        System.out.println("Received DTO: " + bookRequest);
        return bookService.saveBook(bookRequest);
    }
}
