package com.example.planetjpa.Reservation;

import com.example.planetjpa.Customer.Customer;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


@Column(name = "PLANET_NAME",
        nullable = false)
    private String planetName;

@Column(name = "TIME_FRAME",nullable = false)
    private int timeFrame;

@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(
       name = "ALL_RESERVATIONS",
        joinColumns = @JoinColumn(name = "RESERVATION_ID"),
        inverseJoinColumns = @JoinColumn(name = "CUSTOMER_ID")
)
private List<Customer> allReservations = new ArrayList<>();


    public Reservation(String planetName, int timeFrame) {
        this.planetName = planetName;
        this.timeFrame = timeFrame;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", planetName='" + planetName + '\'' +
                ", timeFrame=" + timeFrame +
                '}';
    }
}
