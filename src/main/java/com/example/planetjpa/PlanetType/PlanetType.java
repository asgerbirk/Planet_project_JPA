package com.example.planetjpa.PlanetType;

import com.example.planetjpa.Planet.Planet;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "DIFFERENT_PLANET_TYPES")
public class PlanetType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TERRESTRIAL_PLANETS")
    private String terrestrialPlanets;

    @Column(name = "JOVIAN_PLANETS")
    private String jovianPlanets;

    @Column(name = "DWARF_PLANETS")
    private String dwarfPlanets;

@OneToMany(mappedBy = "planet",
        fetch = FetchType.EAGER,
        cascade = CascadeType.ALL)
private List<Planet> planetTypes = new ArrayList<>();

    @ManyToMany(mappedBy = "planetTypes",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private List<Planet> allPlanets = new ArrayList<>();

    public PlanetType(String terrestrialPlanets, String jovianPlanets, String dwarfPlanets) {
        this.terrestrialPlanets = terrestrialPlanets;
        this.jovianPlanets = jovianPlanets;
        this.dwarfPlanets = dwarfPlanets;
    }

    @Override
    public String toString() {
        return "PlanetType{" +
                "id=" + id +
                ", terrestrialPlanets='" + terrestrialPlanets + '\'' +
                ", jovianPlanets='" + jovianPlanets + '\'' +
                ", dwarfPlanets='" + dwarfPlanets + '\'' +
                '}';
    }
}
