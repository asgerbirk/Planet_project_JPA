package com.example.planetjpa.Planet.Repository;

import com.example.planetjpa.Planet.Model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet,Long> {
}
