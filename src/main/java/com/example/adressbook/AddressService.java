package com.example.adressbook;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class AddressService {

    private final AddressRepository addressRepository;
    public List<Address> GetAllAddress() {
        return addressRepository.findAll();
    }
    public void putAddress(Address newAddress){addressRepository.insert(newAddress);};

    public Address getAddress(String name){return addressRepository.findAddressByNameContainingIgnoreCase(name);};

    public void deleteAddress(String name){addressRepository.deleteAddressByNameContainingIgnoreCase(name);}
}
