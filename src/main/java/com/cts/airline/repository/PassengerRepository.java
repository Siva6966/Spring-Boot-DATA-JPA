package com.cts.airline.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.airline.entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
