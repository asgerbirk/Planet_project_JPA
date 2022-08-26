package com.example.planetjpa.PlanetType.Repository;

import com.example.planetjpa.PlanetType.Model.PlanetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetTypeRepository extends JpaRepository<PlanetType,Long> {
}
