package org.example.services;

import org.example.entities.Book;

import java.util.List;

public interface BookService {

    List<Book> getBooks(String authorName);
    
    List<Book> getBooksByPart(String nameBook);
    
    Book save(Book book);

}
