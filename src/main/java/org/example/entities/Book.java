package org.example.entities;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Component
@RequestScope
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nameBook", nullable = false)
    @NotBlank
    @Size(min = 3, max = 30)
    private String name;
    @Column(name = "authorName", nullable = false)
    @NotBlank
    @Size(min = 5, max = 10)
    private String author;
    
    public Book() {
    }
    
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
