package com.example.adressbook;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

public class AddressController {

    private final AddressService addressService;

    @RequestMapping("api/v1/address")
    @CrossOrigin
    @GetMapping()
    public List<Address> fetchAllAddresses(){
        return addressService.GetAllAddress();
    }

    @RequestMapping(method = RequestMethod.POST,value = "api/v1/new-address")
    @CrossOrigin
    public void putAddress(@RequestBody Address address){

        addressService.putAddress(address);

    };

    @RequestMapping( "api/v1/search-address/{name}")
    @CrossOrigin
    public Address fetchAddress(@PathVariable String name){
        return addressService.getAddress(name);
    };

    @RequestMapping("api/v1/delete-address/{name}")
    @CrossOrigin
    public void deleteAddress(@PathVariable String name){
        addressService.deleteAddress(name);
    }

}
