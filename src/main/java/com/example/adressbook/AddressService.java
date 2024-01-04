package com.example.adressbook;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class AdressService {

    private final AdressRepository adressRepository;
    public List<Adress> GetAllAdress() {
        return adressRepository.findAll();
    }
}
