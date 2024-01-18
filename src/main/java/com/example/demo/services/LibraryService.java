package com.example.demo.services;

import com.example.demo.models.Book;
import com.example.demo.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    LibraryRepository libraryRepository;

    // Create
    public Book createBook(Book book){
        return libraryRepository.save(book);
    }
    // Read
    public List<Book> getAllBooks(){
        return libraryRepository.findAll();
    }

   /* public Book removeBook(){
        return libraryRepository;
    }*/

}
