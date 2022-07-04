package com.example.bookstoreapplication.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Book {
    @Id
    private int bookId;
    private String bookName;
    private String author;
    private long bookPrize;

    public Book(int bookId, String bookName, String author, long bookPrize) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.bookPrize = bookPrize;
    }
}
