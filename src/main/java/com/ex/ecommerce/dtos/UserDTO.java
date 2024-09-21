package com.ex.ecommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String id; // Include if you want to have ID in the DTO
    private String email;
    private String firstName;
    private String lastName;
    private AddressDTO address; // Reference to AddressDTO

}