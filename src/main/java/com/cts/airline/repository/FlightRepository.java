package com.cts.airline.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.airline.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByDestination(String destination);
    List<Flight> findByOrigin(String origin);
    List<Flight> findByFlightDate(LocalDate flightDate);
    List<Flight> findByFlightNumber(String flightNumber);
}
