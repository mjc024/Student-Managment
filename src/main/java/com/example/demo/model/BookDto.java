package com.example.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @NotNull(message = "Title can not be null")
    private String title;
    private String isbn;

    public BookDto() {
    }
    public BookDto(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

}
