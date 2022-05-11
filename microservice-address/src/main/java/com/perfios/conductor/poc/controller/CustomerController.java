package com.perfios.conductor.poc.controller;

import com.perfios.conductor.poc.Customer;
import com.perfios.conductor.poc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping ("/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") String customerId) throws Exception {
        if("1".equalsIgnoreCase(customerId) || "2".equalsIgnoreCase(customerId) || "2".equalsIgnoreCase(customerId)) {
            return customerService.getCustomer(customerId);
        }else{
            throw new Exception("Customer Not Found");
        }
    }
}
