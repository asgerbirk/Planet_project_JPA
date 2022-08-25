package com.example.planetjpa.Planet;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "PLANET")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_planet;

    @Column(name = "PLANET_NAME",
            nullable = false)
    private String name;

    @Column(name = "MASS",
            nullable = false)
    private double mass;

    @Column(name = "DIAMETER",
            nullable = false)
    private double diameter;

    @Column(name = "DENSITY",
            nullable = false)
    private int density;

    @Column(name = "GRAVITY",
            nullable = false)
    private double gravity;

    @Column(name = "LENGHT_OF_DAY",
            nullable = false)
    private double lenghtOfDay;

    @Column(name = "DISTANCE_FROM_SUN",
            nullable = false)
    private double distanceFromSun;

    @Column(name = "NUMBER_OF_MOONS",
            nullable = false)
    private int numberOfMoons;



    public Planet(String name, double mass, double diameter, int density, double gravity, double lenghtOfDay, double distanceFromSun, int numberOfMoons) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.density = density;
        this.gravity = gravity;
        this.lenghtOfDay = lenghtOfDay;
        this.distanceFromSun = distanceFromSun;
        this.numberOfMoons = numberOfMoons;
    }

    public Planet() {
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id_planet=" + id_planet +
                ", name='" + name + '\'' +
                ", mass=" + mass +
                ", diameter=" + diameter +
                ", density=" + density +
                ", gravity=" + gravity +
                ", lenghtOfDay=" + lenghtOfDay +
                ", distanceFromSun=" + distanceFromSun +
                ", numberOfMoons=" + numberOfMoons +
                '}';
    }
}
