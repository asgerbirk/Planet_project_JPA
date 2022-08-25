package com.example.planetjpa;

import com.example.planetjpa.Customer.Customer;

import com.example.planetjpa.Customer.CustomerRepository;
import com.example.planetjpa.Planet.PlanetRepository;
import com.example.planetjpa.PlanetType.PlanetType;
import com.example.planetjpa.PlanetType.PlanetTypeRepository;
import com.example.planetjpa.Reservation.ReservationRepository;
import com.example.planetjpa.Spaceship.SpaceshipRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class PlanetJpaApplication {

    public static void main(String[] args) {
       SpringApplication.run(PlanetJpaApplication.class, args);
     }

     @Bean
   CommandLineRunner commandLineRunner (CustomerRepository customerRepository,
                                        PlanetRepository planetRepository,
                                        PlanetTypeRepository planetTypeRepository,
                                        ReservationRepository reservationRepository,
                                        SpaceshipRepository spaceshipRepository){
       return args -> {
          final List<Customer> customers = new ArrayList<>();
          customers.add(new Customer("John", "zando"));
          customers.add(new Customer("zando", "john"));
          customers.add(new Customer("Mikkel", "john"));
          customers.add(new Customer("Oskar", "Nebsager"));
          customers.add(new Customer("Thomas", "Riise"));
          customers.add(new Customer("Karl", "Utzon"));
          customers.add(new Customer("Smash", "john"));
          customers.add(new Customer("test", "john"));
          customers.add(new Customer("test", "john"));
          customerRepository.saveAll(customers);


       };
     }
}