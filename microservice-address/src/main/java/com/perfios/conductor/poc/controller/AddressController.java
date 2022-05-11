package com.perfios.conductor.poc.controller;

import com.perfios.conductor.poc.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class AddressController {

    private boolean flag ;
    @Autowired
    private AddressService addressService;

    @GetMapping("/customer/{customerId}")
    public AddressResponse getAddress(@PathVariable("customerId") String customerId) throws Exception {
        if(!("5".equalsIgnoreCase(customerId))){
           return addressService.getAddress(customerId);

        }else{
            throw new Exception("Address Not Found");
        }
    }

    @GetMapping("/flag")
    public String updateBooleanFlag(){
        if(this.flag){
            this.flag = false;
        }else{
            this.flag = true;
        }

        return "Success "+this.flag;
    }
}
