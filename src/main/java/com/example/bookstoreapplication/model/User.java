package com.example.bookstoreapplication.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "userDetail")
@Data
@NoArgsConstructor
public class User {
    @Id
    private int userId;
    private String name;
    private String mobileNo;
    private String emailId;
    private String password;
    private String city;
    private String country;
    private long zipCode;
    private String address;
    @ManyToMany
    private List<Book> books = new ArrayList<>();

    public User(int userId, String name, String mobileNo, String emailId, String password, String city, String country, long zipCode, String address, List<Book> books) {
        this.userId = userId;
        this.name = name;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.password = password;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.address = address;
        this.books = books;
    }
}
