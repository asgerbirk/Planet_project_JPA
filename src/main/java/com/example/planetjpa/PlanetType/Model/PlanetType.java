package com.example.planetjpa.PlanetType.Model;
import com.example.planetjpa.Planet.Model.Planet;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Setter
@Entity
@Table(name = "PLANETTYPES")
public class PlanetType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @JsonManagedReference
    @ManyToMany(mappedBy = "types")
    private List<Planet> planets = new ArrayList<>();


    public PlanetType(String name) {
        this.name = name;
    }
}
