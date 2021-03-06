package com.example.bookstoreapplication.repository;

import com.example.bookstoreapplication.model.BookStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStocksRepository extends JpaRepository<BookStock,String> {
    BookStock findByBookName(String bookName);
}
