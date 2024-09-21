package com.ex.ecommerce.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class User {

    @Id
    private String id;

    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private Address address;

}
