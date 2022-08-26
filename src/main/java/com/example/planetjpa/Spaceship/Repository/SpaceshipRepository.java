package com.example.planetjpa.Spaceship.Repository;

import com.example.planetjpa.Spaceship.Model.Spaceship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpaceshipRepository extends JpaRepository<Spaceship,Long> {
}
