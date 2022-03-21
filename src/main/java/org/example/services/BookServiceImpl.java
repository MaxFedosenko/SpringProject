package org.example.services;

import org.example.entities.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import static org.example.config.HibernateConfiguration.sessionFactory;

public class BookServiceImpl implements BookService {
    @Override
    public List<Book> getBooks(String authorName) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
    
        List<Book> books = session.createQuery
                        ("from Book where authorname = :authorname", Book.class)
                .setParameter("authorname", authorName).list();
        
        transaction.commit();
        session.close();

        return books;
    }
    
    @Override
    public List<Book> getBooksByPart(String nameBook) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
    
        List<Book> books = session.createQuery
                        ("from Book where nameBook like :nameBook", Book.class)
                .setParameter("nameBook", '%' + nameBook + '%').list();
        
        transaction.commit();
        session.close();
    
        return books;
    }
    
    @Override
    public Book save(Book book) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();
        session.close();
        return book;
    }
}
