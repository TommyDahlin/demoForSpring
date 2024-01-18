package com.example.demo.repository;

import com.example.demo.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LibraryRepository extends MongoRepository<Book, String> {

}
