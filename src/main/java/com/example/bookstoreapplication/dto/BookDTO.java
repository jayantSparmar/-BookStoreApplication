package com.example.bookstoreapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    @NotNull(message = "Book name should not be null")
    private String bookName;

    @NotNull(message = "author name should not be null")
    private String author;

    @NotNull(message = "book prize should not be null")
    private long bookPrize;

    @NotNull
    @Min(value = 1, message = "quantity should not be zero")
    private int quantity;

}