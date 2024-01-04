package com.example.adressbook;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/adress")
@AllArgsConstructor

public class AdressController {

    private final AdressService adressService;
    @GetMapping
    public List<Adress> fetchAllAdresses(){
        return adressService.GetAllAdress();
    }
}
