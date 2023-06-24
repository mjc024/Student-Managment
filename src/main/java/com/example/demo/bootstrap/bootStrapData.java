package com.example.demo.bootstrap;

import com.example.demo.model.Book;
import com.example.demo.repo.Bookrepositoy;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class bootStrapData implements CommandLineRunner {
    private final Bookrepositoy bookrepositoy;

    @Override
    public void run(String... args) throws Exception {

//        System.out.println("Started in Bootstrap");
//        Book ddd = new Book("Domain Driven Design", "123123");
//        bookrepositoy.save(ddd);
    }
}
