package com.example.planetjpa.Customer;



import com.example.planetjpa.Reservation.Reservation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME",
                    nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME",
                    nullable = false)
    private String lastName;


@ManyToMany(mappedBy = "allReservations",
            fetch = FetchType.EAGER,
             cascade = CascadeType.ALL)
    private Set<Reservation> allCustomers = new HashSet<>();




    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

