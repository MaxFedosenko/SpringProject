package org.example.controllers;

import org.example.entities.Book;
import org.example.services.BookService;
import org.example.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("books")
public class BookSearchController {
    
    @Autowired
    BookService bookService;
    
    @GetMapping("opensearch")
    public String openSearch() {
        return "book";
    }
    
    @GetMapping("opensearchbypart")
    public String openSearchByPart() {
        return "getbook";
    }
    
    @GetMapping("opensave")
    public String openSave(Model model) {
        model.addAttribute("book", new Book());
        return "save";
    }
    
    @GetMapping("searchbook")
    public String getBookByAuthor(@RequestParam(name = "authorName") String authorName,
                          Model model) {
        List<Book> books = bookService.getBookByAuthor(authorName);
        model.addAttribute("books", books);
        return "book";
    }
    
    @GetMapping("searchbookbypart")
    public String getBookByPart(@RequestParam(value = "nameBook") String nameBook,
                                Model model) {
        BookService bookService = new BookServiceImpl();
        List<Book> books = bookService.getBooksByPartName(nameBook);
        model.addAttribute("books", books);
        return "getbook";
    }
    
    @PostMapping("savebook")
    public String saveBook(@ModelAttribute Book book, BindingResult bindingResult) {
        bindingResult.hasErrors();
        BookService bookService = new BookServiceImpl();
        bookService.save(book);
        return "save";
    }
    
}
