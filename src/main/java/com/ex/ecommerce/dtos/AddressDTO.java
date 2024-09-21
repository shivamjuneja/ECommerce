package com.ex.ecommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {
    private String id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String pincode;

    // Getters and Setters
}