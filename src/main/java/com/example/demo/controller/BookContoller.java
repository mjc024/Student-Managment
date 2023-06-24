package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.model.BookDto;
import com.example.demo.repo.Bookrepositoy;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookContoller {

    private final Bookrepositoy bookrepositoy;

//    @RequestMapping("/books")
//    public String getBooks(Model model){
//        model.addAttribute("books",bookrepositoy.findAll());
//        return "books/list";
//    }

    @RequestMapping("/books")
    public Book psBooks(@Valid @RequestBody BookDto b1){

        Book b2 = new Book("asas","dsdmdm");
        return b2;
    }
}
