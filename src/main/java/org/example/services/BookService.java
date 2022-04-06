package org.example.services;

import org.example.entities.Book;

import java.util.List;

public interface BookService {

    List<Book> getBookByAuthor(String authorName);
    
    List<Book> getBooksByPartName(String nameBook);
    
    Book save(Book book);

}
