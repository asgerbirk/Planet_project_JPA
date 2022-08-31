package com.example.planetjpa.Reservation.Model;

import com.example.planetjpa.Customer.Model.Customer;
import com.example.planetjpa.Planet.Model.Planet;
import com.example.planetjpa.Spaceship.Model.Spaceship;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @Column(name = "STARTDATE")
    Date startDate;


    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @Column(name = "ENDDATE")
    Date endDate;

    @ManyToMany(mappedBy = "reservations")
    List<Customer> customers = new ArrayList<>();

    @NonNull
    @ManyToOne
    Planet planet;

    @ManyToOne
    Spaceship spaceship;

    public Reservation(Date startDate, Date endDate, List<Customer> customers, Planet planet, Spaceship spaceship) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.customers = customers;
        this.planet = planet;
        this.spaceship = spaceship;
    }


    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", customers=" + customers +
                ", planet=" + planet +
                ", spaceship=" + spaceship +
                '}';
    }
}
