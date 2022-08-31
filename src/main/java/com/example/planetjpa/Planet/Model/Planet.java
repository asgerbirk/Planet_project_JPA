package com.example.planetjpa.Planet.Model;

import com.example.planetjpa.PlanetType.Model.PlanetType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PLANET")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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



    @JsonManagedReference
    @ManyToMany(cascade = {
        CascadeType.MERGE
    })
    @JoinTable(
        name = "planettype_jointable",
        joinColumns = @JoinColumn(name = "planet_id"),
        inverseJoinColumns = @JoinColumn(name = "planettype_id"))
    private List<PlanetType> types = new ArrayList<>();



    public Planet(String name, double mass, double diameter, int density, double gravity, double lenghtOfDay, double distanceFromSun, int numberOfMoons, List<PlanetType> types) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.density = density;
        this.gravity = gravity;
        this.lenghtOfDay = lenghtOfDay;
        this.distanceFromSun = distanceFromSun;
        this.numberOfMoons = numberOfMoons;
        this.types = types;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id_planet=" + id +
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
