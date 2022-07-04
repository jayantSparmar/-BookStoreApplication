package com.example.bookstoreapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDTO {

    @NotNull(message = "UserName should not be null")
    private String name;

    @NotNull(message = "mobile no shouldn't be null")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid mobileNo entered")
    private String mobileNo;

    @NotBlank
    @Email(message = "Email address entered is not valid")
    private String emailId;

    @NotNull
    private String password;

    @NotNull
    private String city;

    @NotNull
    private String country;

    @NotNull
    private long zipCode;

    @NotNull
    private String address;

}
