package com.ex.ecommerce.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Address {

    @Id
    private String id;

    private String street;
    private String city;
    private String state;
    private String country;
    private String pincode;

}
