package com.example.adressbook;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AddressRepository extends MongoRepository<Address,String> {
    Address findAddressByNameContainingIgnoreCase(String name);
    void deleteAddressByNameContainingIgnoreCase(String name);
};
