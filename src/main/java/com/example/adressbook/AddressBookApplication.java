package com.example.adressbook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


import java.util.List;

@SpringBootApplication
public class  AdressBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdressBookApplication.class, args);
    }

    @Bean
     CommandLineRunner runner(AdressRepository repository){
        return args -> {
            Adress adress = new Adress(
                    "sedelvägen",
                    28,
                    12932,
                    "stockholm",
                    "sweden");

             repository.insert(adress);


        };




    };
}
