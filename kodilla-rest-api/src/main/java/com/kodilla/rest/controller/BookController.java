package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return new ArrayList<>();
    }
    @PostMapping                                         // [1]
    public void addBook(@RequestBody BookDto bookDto) {  // [2]
        bookService.addBook(bookDto);
    }
    @PostMapping
    public void removeBook(@RequestBody BookDto bookDto){
        bookService.removeBook(bookDto);
    }
}