package org.example.controllers;

import org.example.entities.Book;
import org.example.services.BookService;
import org.example.services.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("books")
public class BookSearchController {
    
    
    
    @GetMapping("openSearch")
    public String openSearch() {
        return "book";
    }
    
    @GetMapping("openSearchByPart")
    public String openSearchByPart() {
        return "getBook";
    }
    
    @GetMapping("openSave")
    public String openSave() {
        return "save";
    }
    
    @GetMapping("searchBook")
    public String getBook(@RequestParam(name = "authorName") String authorName,
                          Model model) {
        BookService bookService = new BookServiceImpl();
        List<Book> books = bookService.getBooks(authorName);
        model.addAttribute("books", books);
        return "book";
    }
    
    @GetMapping("searchBookByPart")
    public String getBookByPart(@RequestParam(value = "nameBook") String nameBook,
                                Model model) {
        BookService bookService = new BookServiceImpl();
        List<Book> books = bookService.getBooksByPart(nameBook);
        model.addAttribute("books", books);
        return "getBook";
    }
    
    @PostMapping("saveBook")
    public String saveBook(@Valid @ModelAttribute Book book, BindingResult bindingResult) {
        bindingResult.hasErrors();
        BookService bookService = new BookServiceImpl();
        bookService.save(book);
        return "save";
    }
    
}
