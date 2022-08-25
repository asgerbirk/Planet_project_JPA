package com.example.planetjpa.PlanetType;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "PLANET_TYPE")
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
