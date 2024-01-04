package com.example.adressbook;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AdressRepository extends MongoRepository<Adress,String> {
    Optional<Adress> findAdressByStreet(String street);

};
