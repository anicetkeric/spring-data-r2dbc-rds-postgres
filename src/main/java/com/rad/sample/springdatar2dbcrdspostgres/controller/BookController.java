package com.rad.sample.springdatar2dbcrdspostgres.controller;


import com.rad.sample.springdatar2dbcrdspostgres.entities.Book;
import com.rad.sample.springdatar2dbcrdspostgres.repositories.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Book> createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping
    public Flux<Book> getBooks() {
        return bookRepository.findAll();
    }
}