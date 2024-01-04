package com.example.adressbook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class  AddressBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressBookApplication.class, args);

        //some crazy comment
    }
/*
    @Bean
     CommandLineRunner runner(AddressRepository repository){
        return args -> {
            Address address = new Address(
                    "Jens Ortner",
                    "sedelvägen",
                    28,
                    12932,
                    "stockholm",
                    "sweden");

             repository.insert(address);


        };




    };

 */
}
