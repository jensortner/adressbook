package com.example.adressbook;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
@AllArgsConstructor

public class Address {

    @Id private String name;
    private String street;
    private int streetNumber;
    private long zipCode;
    private String city;
    private String country;

}
