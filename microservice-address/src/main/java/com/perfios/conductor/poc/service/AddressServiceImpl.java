package com.perfios.conductor.poc.service;

import com.perfios.conductor.poc.controller.AddressResponse;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{
    @Override
    public AddressResponse getAddress(String customerId) {
        String output = "Address for customer is actioned !!!!!!!!!!!!!!!!!!!!!"+customerId;
        System.out.println(output);
        AddressResponse addressResponse = new AddressResponse();
        addressResponse.setMessage("success");
        return addressResponse;
    }
}
