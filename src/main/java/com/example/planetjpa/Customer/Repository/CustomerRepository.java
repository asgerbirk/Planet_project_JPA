package com.example.planetjpa.Customer.Repository;

import com.example.planetjpa.Customer.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
