package com.example.planetjpa.Reservation.Repository;

import com.example.planetjpa.Reservation.Model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
