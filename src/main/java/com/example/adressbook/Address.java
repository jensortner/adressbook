package com.example.adressbook;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data

public class Adress {
    @Id
    private String id;
    private String street;
    private int streetNumber;
    private long zipCode;
    private String city;
    private String country;

    public Adress(String street,
                  int streetNumber,
                  long zipCode,
                  String city,
                  String country) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }
}
