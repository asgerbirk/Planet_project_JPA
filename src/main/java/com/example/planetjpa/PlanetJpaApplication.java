package com.example.planetjpa;

import com.example.planetjpa.Customer.Model.Customer;

import com.example.planetjpa.Customer.Repository.CustomerRepository;
import com.example.planetjpa.Planet.Model.Planet;
import com.example.planetjpa.Planet.Repository.PlanetRepository;
import com.example.planetjpa.PlanetType.Model.PlanetType;
import com.example.planetjpa.PlanetType.Repository.PlanetTypeRepository;
import com.example.planetjpa.Reservation.Model.Reservation;
import com.example.planetjpa.Reservation.Repository.ReservationRepository;
import com.example.planetjpa.Spaceship.Model.Spaceship;
import com.example.planetjpa.Spaceship.Repository.SpaceshipRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
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

          final List<Planet> planets = new ArrayList<>();
          planets.add(new Planet("d2d", 123.2,12312,12312,3232,432,123,123));
          planets.add(new Planet("zandoplanet", 123.2,12312,12312,3232,432,123,123));
          planets.add(new Planet("johnplanet", 123.2,12312,12312,3232,432,123,123));
          planets.add(new Planet("hejplanet", 123.2,12312,12312,3232,432,123,123));
          planetRepository.saveAll(planets);

          final List<Spaceship> spaceships = new ArrayList<>();
          spaceships.add(new Spaceship("starwars",10000,50000));
          spaceships.add(new Spaceship("GOT",10,1000000000));
          spaceships.add(new Spaceship("smash",100,50000000));
          spaceshipRepository.saveAll(spaceships);

          final List<Reservation> reservations = new ArrayList<>();
         reservations.add(new Reservation(new Date(), new Date(), customers,planets.get(0),spaceships.get(0)));
         reservations.add(new Reservation(new Date(), new Date(), customers,planets.get(1),spaceships.get(1)));
         reservations.add(new Reservation(new Date(), new Date(), customers,planets.get(2),spaceships.get(2)));
         reservationRepository.saveAll(reservations);


         final List<PlanetType> planetTypes = new ArrayList<>();
         planetTypes.add(new PlanetType("terrestrial planet"));
         planetTypes.add(new PlanetType("jovian planet"));
         planetTypes.add(new PlanetType("Dwarf Planet"));
         planetTypeRepository.saveAll(planetTypes);



       };
     }
}