package com.example.demo.controllers;

import com.example.demo.models.Book;
import com.example.demo.services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class LibraryControllers {
    @Autowired
    LibraryService libraryService;

    // POST
    @PostMapping("/book")
    public Book createBook(@RequestBody Book book){
        return libraryService.createBook(book);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return libraryService.getAllBooks();
    }


}
