package com.example.planetjpa.Customer.Service;

import com.example.planetjpa.Customer.Model.Customer;
import com.example.planetjpa.Customer.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> allCustomers(){
        return customerRepository.findAll();
    }

}
