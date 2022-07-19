package com.example.bookstoreapplication.controller;

import com.example.bookstoreapplication.dto.OrderDTO;
import com.example.bookstoreapplication.dto.ResponseDTO;
import com.example.bookstoreapplication.exception.BookNotFoundException;
import com.example.bookstoreapplication.exception.BookOutOfStockException;
import com.example.bookstoreapplication.exception.UserNotFoundException;
import com.example.bookstoreapplication.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * controller takes API calls for ordering book and provide http response
 **/
@CrossOrigin(origins = "http://localhost:50535")
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    //------------------------------Placing order---------------------------------//
    @GetMapping("/{bookId}/{userId}")
    public ResponseEntity<ResponseDTO> placeOrder(@PathVariable("bookId") int bookId, @PathVariable("userId") int userId) throws UserNotFoundException, BookNotFoundException, BookOutOfStockException {
        ResponseDTO responseDTO = ResponseDTO.Build("Order successful", orderService.placeOrder(bookId, userId));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}