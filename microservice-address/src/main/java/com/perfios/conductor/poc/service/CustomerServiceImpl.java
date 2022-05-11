package com.perfios.conductor.poc.service;

import com.perfios.conductor.poc.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public Customer getCustomer(String customerId) {
        System.out.println("Customer with Id "+customerId +" Exist !!!!");
        Customer customer = new Customer();
        customer.setCustomerId(customerId);
        return customer;
    }
}
